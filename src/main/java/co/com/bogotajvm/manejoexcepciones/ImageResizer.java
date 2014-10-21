/*
 * Copyright (C) 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package co.com.bogotajvm.manejoexcepciones;

import java.nio.file.Path;


/*Patron builder para evitar constructores con muchos parametros maximo 3*/
public class ImageResizer {

    private final Path source;
    private final Path destination;
    private final int width;
    private final int height;

    public static class Builder {

        private Path source;
        private Path destination;
        private int width = 400;
        private int height = 600;

        /**
         * Este contructor solo recibe los parametros que no se pueden fijar
         *
         * @param source
         * @param destination
         */
        public Builder(Path source, Path destination) {
            this.source = source;
            this.destination = destination;
        }

        public Builder withWidth(int width) {
            this.width = width;
            return this;
        }

        public Builder withHeight(int height) {
            this.height = height;
            return this;
        }

        public ImageResizer build() {
            return new ImageResizer(this);
        }

    }

    public ImageResizer(Builder builder) {
        this.source = builder.source;
        this.destination = builder.destination;
        this.width = builder.width;
        this.height = builder.height;
    }

    public void run() {

    }

}
