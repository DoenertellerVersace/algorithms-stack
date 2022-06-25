package org.htw.s0582212.algo.stack.commands;

import org.htw.s0582212.algo.stack.model.Student;
import org.htw.s0582212.algo.stack.model.StudyProgram;

public class PushCommand implements ICommand {

    private static final String NUMBER_PROMPT = "\tplease enter student number\n\t-> ";
    private static final String FIRST_NAME_PROMPT = "\tplease enter a first name\n\t-> ";
    private static final String LAST_NAME_PROMPT = "\tplease enter a last name\n\t-> ";
    private static String STUDY_PROMPT = "\tplease enter the number for the course:\n";

    static {
        for (StudyProgram s : StudyProgram.values()) {
            STUDY_PROMPT += "\t\t" + s.ordinal() + ": " + s.name() + "\n";
        }
        STUDY_PROMPT += "\t-> ";
    }

    @Override
    public void execute() {
        int no = console.readInteger(NUMBER_PROMPT);
        String first = console.readString(FIRST_NAME_PROMPT);
        String last = console.readString(LAST_NAME_PROMPT);
        StudyProgram study = null;
        while (study == null) {
            int _study = console.readInteger(STUDY_PROMPT);
            for (StudyProgram s : StudyProgram.values()) {
                if (_study == s.ordinal()) {
                    study = s;
                }
            }
        }
        stack.push(new Student().studentNo(no).firstName(first).lastName(last).program(study));
        console.write(getConfirmation());
    }

    private String getConfirmation() {
        return "student " + stack.peak() + " was successfully added to the stack!\n";
    }
}
