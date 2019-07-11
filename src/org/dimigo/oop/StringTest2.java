package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        //String 문쟈열 추가
        String str = "디미고";
        str += "2학년";
        str += "5반";
        str += "이원동";
        System.out.println(str);

        //StringBuilder로 문자열 추가
        StringBuilder sb = new StringBuilder("디미고");
        sb.append("2학년").append("2학년").append("왕태규");

        System.out.println(sb.toString());
        System.out.println(sb);

        compareSpeed();
    }

    private static void compareSpeed() {
        long start = System.currentTimeMillis();

        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        for(int i = 0;i<100000000;i++){
            sb2.append("def");
        }


        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
