package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.*;
import ru.netology.repository.IssueRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IssueManagerTest {

    private final IssueRepository issueRepository = new IssueRepository();
    private final IssueManager issueManager = new IssueManager();

    private final Issue issue1 = new Issue(1, "title1", new Author(1, "q1"), new Assignee(1, "a1", "a11"), new Label(1, "z1", "x1", "C1"), Status.OPEN);
    private final Issue issue2 = new Issue(2, "title2", new Author(2, "q2"), new Assignee(2, "a2", "a22"), new Label(2, "z2", "x2", "C2"), Status.CLOSED);
    private final Issue issue3 = new Issue(3, "title3", new Author(3, "q3"), new Assignee(3, "a3", "a33"), new Label(3, "z3", "x3", "C3"), Status.CLOSED);
    private final Issue issue4 = new Issue(4, "title4", new Author(4, "q4"), new Assignee(4, "a4", "a44"), new Label(4, "z4", "x4", "C4"), Status.OPEN);
    private final Issue issue5 = new Issue(5, "title5", new Author(5, "q5"), new Assignee(5, "a5", "a55"), new Label(5, "z5", "x5", "C5"), Status.CLOSED);

    @BeforeEach()
    void setUp() {
        issueRepository.add(issue1);
        issueRepository.add(issue2);
        issueRepository.add(issue3);
        issueRepository.add(issue4);
        issueRepository.add(issue5);
    }

    @Test
    void shouldShowOpen(){
        List<Issue> actual = issueManager.showOpen();
        List<Issue> expected = Arrays.asList(issue1,issue2,issue5);
        assertEquals(expected,actual);
    }

}