package com.jtongay.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.jtongay.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.jtongay.notekeeper.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.jtongay.notekeeper.ORIGINAL_NOTE_TEXT";

    // Would normally use getters and setters for these
    public String mOriginalNoteCourseId;
    public String mOriginalNoteText;
    public String mOriginalNoteTitle;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    public void restoreState(Bundle inState) {
        inState.getString(ORIGINAL_NOTE_COURSE_ID);
        inState.getString(ORIGINAL_NOTE_TITLE);
        inState.getString(ORIGINAL_NOTE_TEXT);
    }
}
