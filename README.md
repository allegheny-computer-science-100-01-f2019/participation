# CMPSC 100-01 Class Activities

## Introduction

Designed for use with [GitHub Classroom](https://classroom.github.com/), this
repository contains the in-class materials that you will need in Computer Science 100-01.
All of the work that you do in class  will count towards your class participation grade.

## Commands

In this class students will use Gradle and GatorGrader tools to help check and complete assignments. Gradle is a build automation tool that compiles (builds) and runs programs for you so that you do not have to enter multiple commands. Additionally, it can perform extra checks, for example ensuring that your program satisfies the styling guidelines.

GatorGrader is an automated grading tool developed by Allegheny computer science students under the direction of Dr. Kapfhammer. It relies on Gradle and can be used to check the correctness of the assignment completion before submitting it. GatorGrader will be used for all lab and practical assignments.

### Using Gradle via Docker

If you are using Docker Desktop you will run a `docker run` command to execute and test your programs.
First, navigate to your "class_activities" directory.
To ensure that the `docker run` command will work correctly, you
should create the cache directory by running the command `mkdir
$HOME/.dockagator`.
To enter an "interactive terminal" that will
allow you to repeatedly run commands within the Docker container, enter the following
`docker run` command into your terminal.

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

This command will use `"$(pwd)"` (i.e., the current directory) as
the project directory and `"$HOME/.dockagator"` as the cached GatorGrader
directory. Please note that both of these directories must exist, although only
the project directory must contain something. Generally, the project directory
should contain the source code as
provided to a student through GitHub. Additionally, the cache directory should
not contain anything other than directories and programs created by DockaGator,
thus ensuring that they are not otherwise overwritten during the completion of
the assignment.

Now you can type `gradle build` to compile your class program and `gradle run` to execute it.


### Using Gradle Directly
On Windows Home, if you have installed the specified software during lab 01, then you can run
the `gradle build` and `gradle run` or `gradle -q --console plain run` commands directly in the terminal from your "class_activities" directory.

You can also complete several important Java programming tasks by using the
`gradle` tool.

- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle run`: run the Java program in the command-line
- `gradle -q --console plain run`: run the Java program while suppressing unnecessary gradle output
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (or "home base") directory
for this assignment where the `build.gradle` file is located. Then, you can type
the command in the terminal and study the output.

## Updates

When the course instructor provides the new material for the in-class activity,
 you can type this command in the main directory for this repository:

```
git remote add download git@github.com/allegheny-computer-science-100-01-f2019/class_activities.git
```

You should only need to type this command once; typing the command additional
times may yield an error message but will not negatively influence the state of
your repository. Now, you are ready to download the updates provided by the
course instructor by typing:

```
git pull download master
```

This second command can be run whenever the course instructor needs to provide
you with new source code for this assignment. However, please note that, if you
have edited the files that the course instructor updated, running the previous
command may lead to Git merge conflicts. If this happens, you may need to
manually resolve them with the help of the instructor or a teaching assistant.


## Problems

If you have found a problem with this assignment's provided source code, then
you can go to the [Computer Science 100-01 Class Activities](https://github.com/allegheny-computer-science-100-01-f2019/class_activities)
repository and create an issue by clicking the "Issues" tab and then clicking
the green "New Issue" button. If you have found a problem with the [GatorGrader
tool](https://github.com/GatorEducator/gatorgrader) and the way that it checks
you assignment, then you can follow the aforementioned steps to create an issue
in its repository. To ensure that your issue is properly resolved, please
provide as many details as is possible about the problem that you experienced.
Students who find &mdash; and use the appropriate GitHub issue tracker to
correctly document &mdash; a mistake in any aspect of these in-class
assignments will receive free GitHub stickers and extra credit towards their
grade for it.

## Assistance

If you are having trouble completing any part of this project, then please talk
with either the course instructor or a teaching assistant during the laboratory
session. Alternatively, you may ask questions in the Slack workspace for this
course. Finally, you can schedule a meeting during the course instructor's
office hours.
