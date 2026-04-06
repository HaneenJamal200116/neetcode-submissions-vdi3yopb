class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                String op=tokens[i];
                int a = stack.pop();
                int b = stack.pop();
                int result = 0;
                switch(op){
                    case "+": result = b + a; break;
                    case "-": result = b - a; break;
                    case "*": result = b * a; break;
                    case "/": result = b / a; break;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
       
    }
}
