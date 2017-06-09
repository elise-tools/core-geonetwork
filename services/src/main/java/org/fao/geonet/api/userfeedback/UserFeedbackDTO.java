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
package org.fao.geonet.api.userfeedback;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFeedbackDTO implements Serializable {

    private static final long serialVersionUID = -5923736997554126836L;

    private String uuid;
    private String comment;
    private Integer ratingAVG;
    private Integer ratingCOMPLETE;
    private Integer ratingREADABILITY;
    private Integer ratingFINDABILITY;
    private Integer ratingOTHER;
    private String metadataUUID;
    private int authorUserId;
    private String authorName;
    private String authorOrganization;
    private String approverName;

    @JsonProperty("keywords")
    private List<String> keywords;

    private Date date;
    private boolean showApproveButton;

    public String getApproverName() {
        return approverName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorOrganization() {
        return authorOrganization;
    }

    public int getAuthorUserId() {
        return authorUserId;
    }

    public String getComment() {
        return comment;
    }

    public Date getDate() {
        return date;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public String getMetadataUUID() {
        return metadataUUID;
    }

    public Integer getRatingAVG() {
        return ratingAVG;
    }

    public Integer getRatingCOMPLETE() {
        return ratingCOMPLETE;
    }

    public Integer getRatingFINDABILITY() {
        return ratingFINDABILITY;
    }

    public Integer getRatingOTHER() {
        return ratingOTHER;
    }

    public Integer getRatingREADABILITY() {
        return ratingREADABILITY;
    }

    public String getUuid() {
        return uuid;
    }

    public boolean isShowApproveButton() {
        return showApproveButton;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setAuthorOrganization(String authorOrganization) {
        this.authorOrganization = authorOrganization;
    }

    public void setAuthorUserId(int authorUserId) {
        this.authorUserId = authorUserId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public void setMetadataUUID(String metadataUUID) {
        this.metadataUUID = metadataUUID;
    }

    public void setRatingAVG(Integer ratingAVG) {
        this.ratingAVG = ratingAVG;
    }

    public void setRatingCOMPLETE(Integer ratingCOMPLETE) {
        this.ratingCOMPLETE = ratingCOMPLETE;
    }

    public void setRatingFINDABILITY(Integer ratingFINDABILITY) {
        this.ratingFINDABILITY = ratingFINDABILITY;
    }

    public void setRatingOTHER(Integer ratingOTHER) {
        this.ratingOTHER = ratingOTHER;
    }

    public void setRatingREADABILITY(Integer ratingREADABILITY) {
        this.ratingREADABILITY = ratingREADABILITY;
    }

    public void setShowApproveButton(boolean showApproveButton) {
        this.showApproveButton = showApproveButton;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
