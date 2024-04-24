package org.example.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task205IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charOpposite = new HashMap<>();
        Set<Character> alreadyOpposite = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            if (charOpposite.containsKey(chS)) {
                if (charOpposite.get(chS) != chT) {
                    return false;
                }
            } else {
                if (alreadyOpposite.contains(chT)) {
                    return false;
                }
                alreadyOpposite.add(chT);
                charOpposite.put(chS, chT);
            }
        }

        return true;
    }

}
