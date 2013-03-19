package fr.blemale.dropwizard.todo.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class TodoCreationRequest {
    @NotNull
    @JsonProperty
    private final String title;
    @JsonProperty
    private final String content;

    public TodoCreationRequest(@JsonProperty("title") String title, @JsonProperty("content") String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}