package org.example.speaker.impl;

import org.example.speaker.ArabicSpeaker;

public class ArabicSpeakerImpl implements ArabicSpeaker {
    @Override
    public void arabicGreeting() {
        System.out.println("Salam Alaykom");
    }
}
