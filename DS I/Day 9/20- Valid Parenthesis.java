Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
                stack.push(s.charAt(i));
            else if(stack.isEmpty()) return false;
            else{
                if((s.charAt(i)==')' && stack.peek()!='(') || (s.charAt(i)=='}' && stack.peek()!='{') || (s.charAt(i)==']' && stack.peek()!='[')) return false;
                else stack.pop();
            }
        }
            if(stack.isEmpty()) return true;
            return false;
