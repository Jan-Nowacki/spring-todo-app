package io.john.programming.todoapp.request;

public class AddTodoRequest {

    private String content;


    public AddTodoRequest() {
    }

    public AddTodoRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
