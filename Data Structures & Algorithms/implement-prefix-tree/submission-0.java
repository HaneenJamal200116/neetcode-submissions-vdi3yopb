public class TrieNode{
     HashMap<Character, TrieNode> children=new HashMap<>();
    boolean isCompletedWord= false;
}

class PrefixTree {
   
    TrieNode root;
    public PrefixTree() {
      
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr=root;
        for (char ch : word.toCharArray()) {
           curr.children.putIfAbsent(ch,new TrieNode());
            curr=curr.children.get(ch);
        }

        curr.isCompletedWord = true;
    }

    public boolean search(String word) {
        TrieNode curr=root;
        for(char ch:word.toCharArray()){
            if(!curr.children.containsKey(ch)) return false;
            curr=curr.children.get(ch);
        }
        return curr.isCompletedWord;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr=root;
        for(char ch:prefix.toCharArray()){
            if(!curr.children.containsKey(ch)){
                return false;
            }
            curr=curr.children.get(ch);
        }
        return true;
    }
}
