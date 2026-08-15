class Solution {
    public int maxFreqSum(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<s.length();i++){
            int x=0;
            for(int j = 0;j<sb.length();j++ ){
                if(s.charAt(i)==sb.charAt(j)){
                    x++;
                }
            }
            if(x==0){
                sb.append(s.charAt(i));
            }
        }
        List<Integer> lst = new ArrayList<>();

        int count;
        for(int i = 0; i<sb.length();i++){
            count = 0;
            for(int j = 0;j<s.length();j++ ){
                if(sb.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            lst.add(count);
            
        }
        int gV=0;
        int gC=0;
        for(int i =0 ; i<lst.size();i++){
            if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){

                if(gV<lst.get(i)){
                    gV=lst.get(i);
                }

            }else{
                if(gC<lst.get(i)){
                    gC=lst.get(i);
                }
            }
        }
        return gV+gC;
        

        



        
    }
}