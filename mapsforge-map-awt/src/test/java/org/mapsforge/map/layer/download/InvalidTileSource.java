/*
 * Copyright 2010, 2011, 2012, 2013 mapsforge.org
 * Copyright 2014 Ludwig M Brinckmann
 * Copyright 2016 devemux86
 * Copyright 2018 iPSAlex
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.mapsforge.map.layer.download;

import org.mapsforge.core.model.Tile;
import org.mapsforge.map.layer.download.tilesource.TileSource;

import java.net.URL;

class InvalidTileSource implements TileSource {
    @Override
    public String getAuthorization() {
        throw new AssertionError();
    }

    @Override
    public long getDefaultTimeToLive() {
        throw new AssertionError();
    }

    @Override
    public int getParallelRequestsLimit() {
        throw new AssertionError();
    }

    @Override
    public String getReferer() {
        throw new AssertionError();
    }

    @Override
    public URL getTileUrl(Tile tile) {
        throw new AssertionError();
    }

    @Override
    public int getTimeoutConnect() {
        throw new AssertionError();
    }

    @Override
    public int getTimeoutRead() {
        throw new AssertionError();
    }

    @Override
    public String getUserAgent() {
        throw new AssertionError();
    }

    @Override
    public byte getZoomLevelMax() {
        throw new AssertionError();
    }

    @Override
    public byte getZoomLevelMin() {
        throw new AssertionError();
    }

    @Override
    public boolean hasAlpha() {
        throw new AssertionError();
    }

    @Override
    public boolean isFollowRedirects() {
        throw new AssertionError();
    }
}
