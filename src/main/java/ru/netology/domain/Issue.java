package ru.netology.domain;

import java.util.HashSet;
import java.util.Set;

public class Issue {

    private int id;
    private String title;
    private Author author;
    private Set<Assignee> assignee = new HashSet<Assignee>();
    private Set<Label> label = new HashSet<Label>();
    private Status status;

    public Issue(int id, String title, Author author, Set<Assignee> assignee, Set<Label> label, Status status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.assignee = assignee;
        this.label = label;
        this.status = status;
    }

    public Issue(int id, String title1, Author q1, Assignee assignee, Label label, Status open) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Assignee> getAssignee() {
        return assignee;
    }

    public void setAssignee(Set<Assignee> assignee) {
        this.assignee = assignee;
    }

    public Set<Label> getLabel() {
        return label;
    }

    public void setLabel(Set<Label> label) {
        this.label = label;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}


