import java.rmi.StubNotFoundException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CrackingHashTable {
//      HashTables
    public HashMap<Integer, Student> buildMap(Student[] students){
        HashMap<Integer, Student> map = new HashMap<Integer, Student>();
        for (Student s : students) map.put(s.getId(),s);
        return map;
    }

//    ArrayList Dynamically resizing
    public ArrayList<String> merge(String[] current, String[] more){
        ArrayList<String> Sentences = new ArrayList<String>();
        for (String c : current) Sentences.add(c);
        for (String m : more) Sentences.add(m);
        return Sentences;
    }
//    StringBuffer/StringBuilder
    public String makeSentence(String[] words){
        StringBuffer sentence = new StringBuffer();
        for (String w : words) sentence.append(w);
        return sentence.toString();
    }

// Cracking the Coding Interviews - Chapter 1
    public boolean UniqueChars(char[] in){
        // without extra data structure
        int count = 0;
        for (char ch : in){
            if (ch < 65 || ch > 90 || ch < 97 || ch > 122)
                count ++;
            if ((ch>=48 && ch<=57))
                count --;
            if ((ch == ch+1))
                return true;
        }
        return false;
    }

    public boolean uniqueChars2 (String in) {
        // without using extra data structure
        boolean[] checkedChars = new boolean[256];
        for (int i=0; i <in.length(); i++){
            int val = in.charAt(i);
            if (checkedChars[val])
                return false;
            checkedChars[val] = true;
        }
        return true;
    }
}
