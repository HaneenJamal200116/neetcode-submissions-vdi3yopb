class Solution {
    ArrayList <String> list;
    public String encode(List<String> strs) {
        StringBuilder word=new StringBuilder();
     
        for(String str:strs){
            word.append(str.length()).append('#').append(str);
        }
        return word.toString();
    }

    public List<String> decode(String str) {
        list =new ArrayList<>();int i=0;
        while(i<str.length()){
            int hashPos=str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i, hashPos));

            int start=hashPos+1;
            int end=len+start;

            list.add(str.substring(start,end));
            i=end;
              
        }
        return list;
    }
}
