class Solution {
    public int dayOfYear(String date) {
        if(date==null || date.length()==0) return 0;
        String[] str = date.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int res = 0;
        for(int i = 0; i < month; i++){
            if(i == 1) res += 31;
            if(i == 2) res += isLeapYear(year)?29:28;
            if(i == 3) res += 31;
            if(i == 4) res += 30;
            if(i == 5) res += 31;
            if(i == 6) res += 30;
            if(i == 7) res += 31;
            if(i == 8) res += 31;
            if(i==9) res += 30;
            if(i==10) res += 31;
            if(i==11) res += 30;
        }
        res += Integer.parseInt(str[2]);
        return res;
    }
    private boolean isLeapYear(int year){
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
}