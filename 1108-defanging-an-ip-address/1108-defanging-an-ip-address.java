class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb1 = new StringBuilder(); 
        for(int i =0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                sb1.append("[.]");
            }else{
                sb1.append(address.charAt(i));
            }
        }
        return sb1.toString();
    }
}