class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        char[] temp = s.toCharArray();
        for(int i=0; i<temp.length; i++){
            if(temp[i]=='6'){
                temp[i]='9';
                break;
            }
        }
        s = new String(temp);
        int out = Integer.parseInt(s);
        return out;
    }
}
