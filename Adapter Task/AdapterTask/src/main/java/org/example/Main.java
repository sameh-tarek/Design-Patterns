package org.example;

import org.example.adapter.LanguageClassAdapter;
import org.example.adapter.LanguageObjectAdapter;
import org.example.speaker.ArabicSpeaker;
import org.example.speaker.EnglishSpeaker;
import org.example.speaker.impl.EnglishSpeakerImpl;

public class Main {
    public static void main(String[] args) {
        // Object Adapter
        EnglishSpeaker englishSpeaker = new EnglishSpeakerImpl();
        ArabicSpeaker arabicSpeakerObjectAdapter = new LanguageObjectAdapter(englishSpeaker);
        arabicSpeakerObjectAdapter.arabicGreeting();

        // Class Adapter
        ArabicSpeaker arabicSpeakerClassAdapter = new LanguageClassAdapter();
        arabicSpeakerClassAdapter.arabicGreeting();
    }
}