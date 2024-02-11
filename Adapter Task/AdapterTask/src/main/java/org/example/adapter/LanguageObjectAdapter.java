package org.example.adapter;

import org.example.speaker.ArabicSpeaker;
import org.example.speaker.EnglishSpeaker;

public class LanguageObjectAdapter implements ArabicSpeaker {
    EnglishSpeaker englishSpeaker;

    public LanguageObjectAdapter(EnglishSpeaker englishSpeaker) {
        this.englishSpeaker = englishSpeaker;
    }

    @Override
    public void arabicGreeting() {
        englishSpeaker.englishGreeting();
    }
}
