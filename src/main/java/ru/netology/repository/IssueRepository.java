package ru.netology.repository;

import ru.netology.domain.Issue;
import ru.netology.domain.Status;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IssueRepository {

    private final List<Issue> issues = new ArrayList<>();

    public boolean add(Issue issue){
        return issues.add(issue);
    }

    public boolean remove(Issue issue) {
        return issues.remove(issue);
    }

    public List<Issue> getAll() {
        return issues;
    }

    public Issue getById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                return issue;
            }
        }
        return null;
    }

    public void openById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                issue.setStatus(Status.OPEN);
            }
        }
    }


    public void closeById(int id) {
        for (Issue issue : issues) {
            if (issue.getId() == id) {
                issue.setStatus(Status.CLOSED);
            }
        }
    }

    public boolean addAll(Collection<? extends Issue> issues) {
        return this.issues.addAll(issues);
    }

    public boolean removeAll(Collection<? extends Issue> issues) {
        return this.issues.removeAll(issues);
    }


}
