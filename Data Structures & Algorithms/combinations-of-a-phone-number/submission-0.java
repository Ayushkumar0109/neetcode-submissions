class Solution {
    Map<Character,String> map = new HashMap();
    public List<String> letterCombinations(String digits) {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        int len = digits.length();    
        List<String> result = new ArrayList();
        if(len==0){
            
            return result;
        }
        backtrack(digits, result, new StringBuilder(),len,0);
        return result;    
    }

    public void backtrack(String digits,List<String> result, StringBuilder sb, int len, int index){
        if(index > len) return;
        
        if(sb.length()==len){
            result.add(sb.toString());
            return;
        }
    
        String s = map.get(digits.charAt(index));
        for(char ch: s.toCharArray()){
            sb.append(ch);
            backtrack(digits, result, sb, len, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
        


    }
}


