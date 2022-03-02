package ru.netology.manager;

import ru.netology.domain.Author;
import ru.netology.domain.Issue;
import ru.netology.domain.Status;
import ru.netology.repository.IssueRepository;

import java.util.ArrayList;
import java.util.List;

public class IssueManager {

    private IssueRepository issueRepository;

    public IssueManager(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public IssueManager() {
    }

    public List<Issue> showOpen(){
        List<Issue> tmp = new ArrayList<>();
        for (Issue issue : issueRepository.getAll()){
            if (issue.getStatus().equals(Status.OPEN)){
                tmp.add(issue);
            }
        }
        return tmp;
    }


    public List<Issue> showClosed(){
        List<Issue> tmp = new ArrayList<>();
        for (Issue issue : issueRepository.getAll()){
            if (issue.getStatus().equals(Status.CLOSED)){
                tmp.add(issue);
            }
        }
        return tmp;
    }

    public void add(Issue issue){
        issueRepository.add(issue);
    }


}
