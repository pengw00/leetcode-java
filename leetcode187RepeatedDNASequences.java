import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.*;
public class leetcode187RepeatedDNASequences{
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> seqs = new ArrayList<>();
        Set<Integer> seq = new HashSet<>();
        Set<Integer> repeatedSeq = new HashSet<>();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('A',0);
        map.put('C',1);
        map.put('G',2);
        map.put('T',3);
        
        int v = 0;
        // Use a sliding window to check every 10-bit substring
        for (int i = 0; i < s.length(); i++) {
            // 2 bits/char * 10 char = 20 bits so use 0xfffff
            v = (v<<2 | map.get(s.charAt(i))) & 0xfffff; 
            if (i < 9) continue;
            else {
                if (!seq.add(v) && repeatedSeq.add(v))
                    seqs.add(s.substring(i-9, i+1));
            }
        }
        
        return seqs;
    }

   public static void main(String args[]) {
      String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
      int v = 0;
      v = v << 2 | 1 ;
      char result = s.charAt(8);
      System.out.println(result);
      System.out.println(v);
      System.out.println(0xffff);
      System.out.println(findRepeatedDnaSequences(s));
   }
}