import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        //Custom_List_Imp<Integer> list = new Custom_List_Imp<Integer>();
        int in;
        Custom_List_Imp<String> list = new Custom_List_Imp<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation to be performed on list:");
        System.out.println("1.add\n2.get\n3.remove\n4.get size\n5.display");
        try {
            while (true) {
                System.out.println("Enter your choice:");
                int ch = sc.nextInt();
                if (ch == 1) {
                        System.out.println("Enter element to be add");
                        String str = sc.next();
                        list.add(str);
                } else if (ch == 2) {
                    System.out.println("Enter index of element to get that element:\n");
                    in = sc.nextInt();
                    System.out.println(list.get(in));//System.out.println("YOU entered invalid input");
                } else if (ch == 3) {
                    System.out.println("Enter index of removing element:");
                    in = sc.nextInt();
                    list.remove(in);
                } else if (ch == 4) {
                    System.out.println("Size of list is:");
                    System.out.println(list.size());
                } else if (ch == 5) {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                    //for(String tmp:list) System.out.println(tmp);

                } else {
                    System.out.println("YOU entered invalid input");
                    break;
                }
            }
        }
        catch (Exception e){
            System.out.println("YOU entered invalid input that causes InputMismatchException`");
        }

    }
}