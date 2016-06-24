/*
 * Copyright (C) 2001-2016 Food and Agriculture Organization of the
 * United Nations (FAO-UN), United Nations World Food Programme (WFP)
 * and United Nations Environment Programme (UNEP)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301, USA
 *
 * Contact: Jeroen Ticheler - FAO - Viale delle Terme di Caracalla 2,
 * Rome - Italy. email: geonetwork@osgeo.org
 */

package org.fao.geonet.api;

/**
 * A set of static variables describing API parameters.
 */
public class ApiParams {
    public static final String API_CLASS_RECORD_TAG = "records";
    public static final String API_CLASS_RECORD_OPS = "Metadata record operations";
    public static final String API_CLASS_CATALOG_OPS = "Catalog operations";
    public static final String API_CLASS_CATALOG_TAG = "site";

    public static final String API_PARAM_RECORD_UUID = "Record UUID.";
    public static final String API_PARAM_RECORD_UUIDS = "One or more record UUIDs";
    public static final String API_PARAM_RECORD_UUIDS_OR_SELECTION = "Record UUIDs. If null current selection is used.";
    public static final String API_PARAM_CLEAR_ALL_BEFORE_INSERT = "Clear all before adding new ones";
    public static final String API_PARAM_SCHEMA_IDENTIFIERS = "Schema identifiers";
    public static final String API_PARAM_PROCESS_TEST_ONLY = "Test only (ie. metadata are not saved). Return the report only.";
    public static final String API_PARAM_PROCESS_ID = "Process identifier";
    public static final String API_OP_NOTE_PROCESS = "Process a metadata with an XSL transformation declared for " +
        "the metadata schema (See the process folder). " +
        "Parameters sent to the service are forwarded " +
        "to XSL process.";
    public static final String API_PARAM_METADATA_TITLE = "Metadata title";
    public static final String API_PARAM_MAPSERVER_RESOURCE = "Resource name (could be a file or a db connection)";
    public static final String API_PARAM_METADATA_ABSTRACT = "Metadata abstract";
}