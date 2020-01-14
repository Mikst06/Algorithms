public class intToRoman {
    public String intToRoman(int num){
        String numS = Integer.toString(num);
        int len = numS.length();
        int[] number = new int[len];
        for(int i = 0; i < len; i++){
                number[i] = (Character.getNumericValue(numS.charAt(i)));}
        return conv(number);
    }

    private String conv(int[] number){
        int x  = number.length;
        int i = 0;
        StringBuilder build = new StringBuilder();
        if(x==4){
            for(int j = 0; j < number[i]; j++){
            build.append("M").toString();
            }
            i++;
            x--;
        }
        if(x==3){
            if(number[i]==0){
                i++;
                x--;
            }
            else {
                if (number[i] < 4) {
                    for (int j = 0; j < number[i]; j++) {
                        build.append("C").toString();
                    }
                    i++;
                    x--;
                } else if (number[i] == 4) {
                    build.append("CD").toString();
                    i++;
                    x--;
                } else if (number[i] < 9) {
                    build.append("D").toString();
                    for (int j = 0; j < (number[i] - 5); j++) {
                        build.append("C").toString();
                    }
                    i++;
                    x--;
                } else if (number[i] == 9) {
                    build.append("CM").toString();
                    i++;
                    x--;
                }
            }
        }

        if(x==2){
            if(number[i]==0){
                i++;
                x--;
            }
            else {
                if (number[i] < 4) {
                    for (int j = 0; j < number[i]; j++) {
                        build.append("X").toString();
                    }
                    i++;
                    x--;
                } else if (number[i] == 4) {
                    build.append("XL").toString();
                    i++;
                    x--;
                } else if (number[i] < 9) {
                    build.append("L").toString();
                    for (int j = 0; j < (number[i] - 5); j++) {
                        build.append("X").toString();
                    }
                    i++;
                    x--;
                } else if (number[i] == 9) {
                    build.append("XC").toString();
                    i++;
                    x--;
                }
            }
        }
        if(number[i]!=0 && x==1){
            if(number[i]<4){
                for(int j = 0; j < number[i]; j++){
                    build.append("I").toString();
                }
            }
            else if(number[i]==4){
                build.append("IV").toString();
            }
            else if(number[i]<9){
                build.append("V").toString();
                for(int j = 0; j < (number[i]-5); j++){
                    build.append("I").toString();
                }
            }
            else if(number[i]==9){
                build.append("IX").toString();
            }
        }


        return build.toString();
    }

    public static void main(String[] args){
        int num = 400;
        intToRoman cos = new intToRoman();

        System.out.println(cos.intToRoman(num));
    }
}
