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

import java.awt.image.BufferedImage;

public class Image {

    private BufferedImage image;

    public Image(BufferedImage image) {
        this.image = image;
    }
    /*a los metodos que queremos reutilizar los delegamos en nuestro objeto*/

    public int getHeight() {
        return this.image.getHeight();
    }
    /*a los metodos que queremos reutilizar los delegamos en nuestro objeto*/

    public int getWidth() {
        return this.image.getWidth();
    }

    public Image resize(int height, int width) {
        BufferedImage resizedImage = new BufferedImage(width, height, this.image.getType());
        return null; // TODO: por construir
    }
}
