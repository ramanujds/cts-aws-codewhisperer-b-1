package com.cts;

import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws GitAPIException, IOException {
        System.out.println("Hello world!");

       // Git git = Git.init().setDirectory(new File("/Users/ramanujdas/Documents/Training-Programs/cts-aws-codewhisperer")).call();

        // How to clone an existing repository

//        Git git = Git.cloneRepository()
//                .setURI("https://github.com/ramanujds/jgit-example-repo.git")
//                .setDirectory(new File("/Users/ramanujdas/Documents/Training-Programs/cts-aws-codewhisperer/jgit-demo-repo"))
//                .call();

        // How to add changes?

 //       Git git = Git.open(new File("/Users/ramanujdas/Documents/Training-Programs/cts-aws-codewhisperer/jgit-demo-repo"));

//        AddCommand add = git.add();
//
//        add.addFilepattern("README.md").call();
//
//
//        // How to commit?
//
//        CommitCommand commit = git.commit();
//
//        commit.setAll(true).setMessage("Test commit").call();
//
//        // How to push?
//
//        PushCommand push = git.push();
//        // Provide the credentials
//
//        push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("ramanujds","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"));
//
//        push.call();


        // How to pull changes

        Git git = Git.open(new File("/Users/ramanujdas/Documents/Training-Programs/cts-aws-codewhisperer/jgit-demo-repo"));

        PullCommand pullCommand = git.pull();

        pullCommand.call();


    }
}