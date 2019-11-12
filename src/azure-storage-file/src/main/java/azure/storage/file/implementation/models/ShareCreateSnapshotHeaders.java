// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for CreateSnapshot operation.
 */
@JacksonXmlRootElement(localName = "Share-CreateSnapshot-Headers")
@Fluent
public final class ShareCreateSnapshotHeaders {
    /*
     * This header is a DateTime value that uniquely identifies the share
     * snapshot. The value of this header may be used in subsequent requests to
     * access the share snapshot. This value is opaque.
     */
    @JsonProperty(value = "x-ms-snapshot")
    private String snapshot;

    /*
     * The ETag contains a value which represents the version of the share
     * snapshot, in quotes. A share snapshot cannot be modified, so the ETag of
     * a given share snapshot never changes. However, if new metadata was
     * supplied with the Snapshot Share request then the ETag of the share
     * snapshot differs from that of the base share. If no metadata was
     * specified with the request, the ETag of the share snapshot is identical
     * to that of the base share at the time the share snapshot was taken.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * Returns the date and time the share was last modified. A share snapshot
     * cannot be modified, so the last modified time of a given share snapshot
     * never changes. However, if new metadata was supplied with the Snapshot
     * Share request then the last modified time of the share snapshot differs
     * from that of the base share. If no metadata was specified with the
     * request, the last modified time of the share snapshot is identical to
     * that of the base share at the time the share snapshot was taken.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the snapshot property: This header is a DateTime value that uniquely
     * identifies the share snapshot. The value of this header may be used in
     * subsequent requests to access the share snapshot. This value is opaque.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: This header is a DateTime value that uniquely
     * identifies the share snapshot. The value of this header may be used in
     * subsequent requests to access the share snapshot. This value is opaque.
     *
     * @param snapshot the snapshot value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value which represents the
     * version of the share snapshot, in quotes. A share snapshot cannot be
     * modified, so the ETag of a given share snapshot never changes. However,
     * if new metadata was supplied with the Snapshot Share request then the
     * ETag of the share snapshot differs from that of the base share. If no
     * metadata was specified with the request, the ETag of the share snapshot
     * is identical to that of the base share at the time the share snapshot
     * was taken.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value which represents the
     * version of the share snapshot, in quotes. A share snapshot cannot be
     * modified, so the ETag of a given share snapshot never changes. However,
     * if new metadata was supplied with the Snapshot Share request then the
     * ETag of the share snapshot differs from that of the base share. If no
     * metadata was specified with the request, the ETag of the share snapshot
     * is identical to that of the base share at the time the share snapshot
     * was taken.
     *
     * @param eTag the eTag value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: Returns the date and time the share was
     * last modified. A share snapshot cannot be modified, so the last modified
     * time of a given share snapshot never changes. However, if new metadata
     * was supplied with the Snapshot Share request then the last modified time
     * of the share snapshot differs from that of the base share. If no
     * metadata was specified with the request, the last modified time of the
     * share snapshot is identical to that of the base share at the time the
     * share snapshot was taken.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: Returns the date and time the share was
     * last modified. A share snapshot cannot be modified, so the last modified
     * time of a given share snapshot never changes. However, if new metadata
     * was supplied with the Snapshot Share request then the last modified time
     * of the share snapshot differs from that of the base share. If no
     * metadata was specified with the request, the last modified time of the
     * share snapshot is identical to that of the base share at the time the
     * share snapshot was taken.
     *
     * @param lastModified the lastModified value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the ShareCreateSnapshotHeaders object itself.
     */
    public ShareCreateSnapshotHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
