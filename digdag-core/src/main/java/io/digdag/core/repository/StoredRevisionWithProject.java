package io.digdag.core.repository;

import java.time.Instant;
import com.google.common.base.*;
import com.google.common.collect.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableStoredRevisionWithProject.class)
@JsonDeserialize(as = ImmutableStoredRevisionWithProject.class)
public abstract class StoredRevisionWithProject extends StoredRevision {
    public abstract String getProjectName();

    public abstract Instant getCreatedAt();

    public abstract Optional<Instant> getDeletedAt();
}
