/**
 * @author ZJ
 * @create 2020-04-26 21:31
 */

import java.util.ArrayList;

/**
 * idea中代码模板所处的位置settings-Editor-live Templates/poostfixCompletion
 */
public class Hellow {
    //模板1:psvm
    public static void main(String[] args) {
        //模板二:sout
        System.out.println("hello");
        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Hellow.main");
        int num1=10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);

        //模板三:fori
        String[] arr=new String[]{"tom","sam","ming"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形:iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        //xxx.for
        ArrayList<String> list=new ArrayList<>();
        list.add("232");
        list.add("qw");
        for (String s : list) {

        }
        //xxx.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //xxx.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }


    }
}
