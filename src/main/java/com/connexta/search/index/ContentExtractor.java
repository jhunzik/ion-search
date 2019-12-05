/*
 * Copyright (c) 2019 Connexta, LLC
 *
 * Released under the GNU Lesser General Public License version 3; see
 * https://www.gnu.org/licenses/lgpl-3.0.html
 */
package com.connexta.search.index;

import com.connexta.search.index.exceptions.ContentException;
import java.io.InputStream;

public interface ContentExtractor {

  String extractText(InputStream inputStream) throws ContentException;
}
