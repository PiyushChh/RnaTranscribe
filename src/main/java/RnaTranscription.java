import java.util.HashMap;
import java.util.Map;

class RnaTranscription {
    Map<Character, Character> map = new HashMap<>();

    RnaTranscription() {
        map.put('G', 'C');
        map.put('C', 'G');
        map.put('T', 'A');
        map.put('A', 'U');
    }

    String transcribe(String dnaStrand) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            char ch = dnaStrand.charAt(i);
            s.append(map.get(ch));
        }
        return s.toString();
    }
}
