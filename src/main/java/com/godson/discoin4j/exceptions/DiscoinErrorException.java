package com.godson.discoin4j.exceptions;

import com.godson.discoin4j.Discoin4J;

public class DiscoinErrorException extends Exception {

    private Discoin4J.Status status;

    public DiscoinErrorException(Discoin4J.Status status) {
        super(status.getReason());
        this.status = status;
    }

    public Discoin4J.Status getStatus() {
        return status;
    }
}
