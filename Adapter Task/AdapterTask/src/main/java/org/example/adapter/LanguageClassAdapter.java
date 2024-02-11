package org.example.adapter;

import org.example.speaker.ArabicSpeaker;
import org.example.speaker.impl.EnglishSpeakerImpl;

public class LanguageClassAdapter extends EnglishSpeakerImpl implements ArabicSpeaker {
    @Override
    public void arabicGreeting() {
        englishGreeting();
    }
}
