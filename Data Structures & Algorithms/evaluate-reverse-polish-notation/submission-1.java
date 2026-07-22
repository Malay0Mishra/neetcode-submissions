class Solution {
    public int evalRPN(String[] tokens) {
        Deque <Integer> stack = new ArrayDeque<>();
        int left = 0;
        
        for(int right = 0; right < tokens.length; right ++){
            if(tokens[right].equals("+") || tokens[right].equals("-") || tokens[right].equals("*")|| tokens[right].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                if(tokens[right].equals("+")){
                    int c = a + b;
                    stack.push(c);
                }
                else if(tokens[right].equals("-")){
                    int d = b - a ;
                    stack.push(d);
                }
                else if(tokens[right].equals("*")){
                    int e = a*b;
                    stack.push(e);
                }
                else if(tokens[right].equals("/")){
                    int f = b/a;
                    stack.push(f);
                }

            }
            else{
               stack.push(Integer.parseInt(tokens[right]));
            }
        }
        return stack.pop();
        }
        }