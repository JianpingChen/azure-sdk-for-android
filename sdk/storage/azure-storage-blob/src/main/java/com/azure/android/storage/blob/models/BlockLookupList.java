// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * The BlockLookupList model.
 */
@JacksonXmlRootElement(localName = "BlockList")
public final class BlockLookupList {
    /*
     * The committed property.
     */
    @JsonProperty("Committed")
    private List<String> committed = new ArrayList<>();

    /*
     * The uncommitted property.
     */
    @JsonProperty("Uncommitted")
    private List<String> uncommitted = new ArrayList<>();

    /*
     * The latest property.
     */
    @JsonProperty("Latest")
    private List<String> latest = new ArrayList<>();

    /**
     * Get the committed property: The committed property.
     *
     * @return the committed value.
     */
    public List<String> getCommitted() {
        return this.committed;
    }

    /**
     * Set the committed property: The committed property.
     *
     * @param committed the committed value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setCommitted(List<String> committed) {
        this.committed = committed;
        return this;
    }

    /**
     * Get the uncommitted property: The uncommitted property.
     *
     * @return the uncommitted value.
     */
    public List<String> getUncommitted() {
        return this.uncommitted;
    }

    /**
     * Set the uncommitted property: The uncommitted property.
     *
     * @param uncommitted the uncommitted value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setUncommitted(List<String> uncommitted) {
        this.uncommitted = uncommitted;
        return this;
    }

    /**
     * Get the latest property: The latest property.
     *
     * @return the latest value.
     */
    public List<String> getLatest() {
        return this.latest;
    }

    /**
     * Set the latest property: The latest property.
     *
     * @param latest the latest value to set.
     * @return the BlockLookupList object itself.
     */
    public BlockLookupList setLatest(List<String> latest) {
        this.latest = latest;
        return this;
    }
}