package com.java.SubmissionForm.service;

import com.java.SubmissionForm.model.SubmissionForm;

import java.util.List;

public interface SubmissionService {

    SubmissionForm getSubmission(String id);

    SubmissionForm addSubmission(SubmissionForm submission);

    SubmissionForm updateSubmission(SubmissionForm submission);

    boolean deleteSubmission(String id);

    List<SubmissionForm> getAll();
}
