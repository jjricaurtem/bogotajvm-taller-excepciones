/*
 * Copyright (C) 2014 John Ricaurte<john.ricaurte.ext@claro.com.co>
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

public final class Images {

    private Images() {
        throw new AssertionError(""); /*Para que no se pueda llamar el contructor  ni cpn reflection*/

    }

    public static boolean isImage(Path path) {
        String filepath = path.toString();
        String extension = filepath.substring(filepath.lastIndexOf('.', +1));
        switch (extension) {
            case "jpg":
            case "JPG":
                return true;
        }
        return false;
    }
}
