import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchParenthesis {
    public static final Map<Character, Character> matchingParenMap = new HashMap<>();
    public static final Set<Character> openingParenSet = new HashSet<>();
    static {
        matchingParenMap.put(')', '(');
        matchingParenMap.put(']', '[');
        matchingParenMap.put('}', '{');
        openingParenSet.addAll(matchingParenMap.values());
        //System.out.println(openingParenSet);
    }
    public static void main(String[] args) {
        String str = "{(ABC)][(DEF))]GH]I}";
        boolean match = true;
        Stack<Character> parentheses = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (openingParenSet.contains(ch)) {
                parentheses.push(ch);
            }
            else if (matchingParenMap.containsKey(ch)) {
                try {
                    char lastParenthesis = parentheses.pop();
                    if (lastParenthesis != matchingParenMap.get(ch)) {
                        match = false;
                    }
                }
                catch (Exception e) {
                    match = false;
                }
            }
        }
        if (!parentheses.isEmpty()) {
            match = false;
        }
        System.out.println(match);
    }
}
