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
    // Question 1.1
    public boolean UniqueChars(String in){
        // without extra data structure
        int count = 0;
        char lasyUnique;
        for (int i=0; i<in.length(); i++){
            if (in.charAt(i) < 65 || in.charAt(i) > 90 || in.charAt(i) < 97
                    || in.charAt(i) > 122){
                count ++;
                lasyUnique = in.charAt(i);
            }
            if ((in.charAt(i)>=48 && in.charAt(i)<=57))
                count --;
            if ((in.charAt(i) == in.charAt(i)+1))
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
//    Question 1.2
    public String reverse(String str){
        String reversed = "";
        for (int i=str.length()-1; i>=0; i--){
            reversed += String.valueOf(str.charAt(i));
        }
        return reversed;
    }
}
