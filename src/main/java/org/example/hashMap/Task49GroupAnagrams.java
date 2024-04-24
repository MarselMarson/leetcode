package org.example.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task49GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);

        char[] tArr = t.toCharArray();
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        Set<String> anagramFounded = new HashSet<>();


        for (String str : strs) {
            for (List<String> list : lists) {
                if (isAnagram(list.get(0), str)) {
                    list.add(str);
                    anagramFounded.add(str);
                    break;
                }
            }
            if (!anagramFounded.contains(str)) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(str);
                lists.add(newGroup);
                anagramFounded.add(str);
            }
        }

        return lists;
    }
}
