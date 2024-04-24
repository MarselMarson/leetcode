package org.example.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task290WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> usedWords = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                if (usedWords.contains(words[i])) {
                    return false;
                }
                usedWords.add(words[i]);
                map.put(ch, words[i]);
            }
        }

        return true;
    }
}
