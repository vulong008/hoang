package javacorer;

public class soNHICH {

    public static boolean testSoThuanNghich(int n) {
        StringBuilder xau = new StringBuilder();//khai boa 1 lop stringbuilder
        String str = "" + n;//khai bao kieu chuoi 967769
        xau.append(str);//them chuoi str vao cuoi chuoi
        String check = "" + xau.reverse();//dao chuoi
        if (str.equals(check)) {//neu chuoi bang nha thi true
            return true;
        } else {
            return false;
        }

    }
    
    

    public static void main(String[] args) {
        int n, count = 0;
        for (n = 100000; n <= 999999; n++) {
            if (testSoThuanNghich(n)) {
                System.out.println(n);
                count++;
            }
        }
        System.out.println("Co " + count + " so thuan nghich co 6 chu so");
    }

}
