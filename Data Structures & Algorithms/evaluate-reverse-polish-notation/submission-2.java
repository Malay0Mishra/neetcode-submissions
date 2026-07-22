
class Solution {
  

    public int evalRPN(String[] tokens) {
        Deque <Integer> stackChan = new ArrayDeque<>();
        for(String token : tokens){
            switch(token) {
                case "+":{
                int a = stackChan.pop();
                int b = stackChan.pop();
                int c = a + b;
                stackChan.push(c);
                break;}
            
            case "-":{
                int a = stackChan.pop();
                int b = stackChan.pop();
                int d = b - a;
                stackChan.push(d);
                break;
            }
            case "*":{
                int a = stackChan.pop();
                int b = stackChan.pop();
                int e = a * b;
                stackChan.push(e);
                break;}

            case "/":{
                int a = stackChan.pop();
                int b = stackChan.pop();
                int f = b/a;
                stackChan.push(f);
                break;
            }
            
            default:
                stackChan.push(Integer.parseInt(token));
            }
            
        }
        return stackChan.pop();
    }
}