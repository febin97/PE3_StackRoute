package com.stackroute;

public class Places {
    public String[] placesWithoutVowels(String[] strArr){
        if(strArr==null){
            return null;
        }
        StringBuilder sb;
        for (int i=0;i<strArr.length;i++){
            String strCurr = strArr[i];
            sb = new StringBuilder(strCurr);
            int j=0;
            while (j<sb.length()){
                char ch = sb.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    sb.deleteCharAt(j);
                    continue;
                }
                j++;
            }
            strArr[i] = sb.toString();
        }
        return strArr;
    }
}
