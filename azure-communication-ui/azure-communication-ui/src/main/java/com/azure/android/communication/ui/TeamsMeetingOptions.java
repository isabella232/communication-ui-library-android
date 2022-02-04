// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.communication.ui;

import com.azure.android.communication.common.CommunicationTokenCredential;

/**
 * Options to start Teams meeting call experience using {@link CallComposite}.
 */
public final class TeamsMeetingOptions {
    private final CommunicationTokenCredential communicationTokenCredential;
    private final String displayName;
    private final String meetingLink;

    /**
     * Create {@link TeamsMeetingOptions}.
     * @param communicationTokenCredential {@link CommunicationTokenCredential}
     * @param meetingLink Teams meeting link
     */
    public TeamsMeetingOptions(
                               final CommunicationTokenCredential communicationTokenCredential,
                               final String meetingLink) {
        this(communicationTokenCredential, meetingLink, "");
    }

    /**
     * Create {@link TeamsMeetingOptions}.
     * @param communicationTokenCredential {@link CommunicationTokenCredential}
     * @param meetingLink Teams meeting link
     * @param displayName user display name
     */
    public TeamsMeetingOptions(final CommunicationTokenCredential communicationTokenCredential,
                               final String meetingLink,
                               final String displayName) {
        this.communicationTokenCredential = communicationTokenCredential;
        this.displayName = displayName;
        this.meetingLink = meetingLink;
    }

    /**
     * Get {@link CommunicationTokenCredential}.
     * @return {@link String}
     */
    public CommunicationTokenCredential getCommunicationTokenCredential() {
        return communicationTokenCredential;
    }

    /**
     * Get user display name.
     * @return {@link String}
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Get Teams meeting link.
     * @return {@link String}
     */
    public String getMeetingLink() {
        return meetingLink;
    }
}
