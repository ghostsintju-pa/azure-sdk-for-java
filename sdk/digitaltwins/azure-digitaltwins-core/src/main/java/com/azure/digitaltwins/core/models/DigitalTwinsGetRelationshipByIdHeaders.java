/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License.
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.azure.digitaltwins.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for GetRelationshipById operation.
 */
public class DigitalTwinsGetRelationshipByIdHeaders {
    /**
     * Weak Etag.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Get weak Etag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set weak Etag.
     *
     * @param eTag the eTag value to set
     * @return the DigitalTwinsGetRelationshipByIdHeaders object itself.
     */
    public DigitalTwinsGetRelationshipByIdHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
