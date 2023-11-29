//import java.util.Random;
//import java.util.Scanner;
//
//public class nhap {
//    public static void main(String[] args) {
//        String name;
//        int hour;
//        double payRate;
//        double grossPay;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("What your name?");
//        name = keyboard.nextLine();
//
//        System.out.println("How many hour did you work this week");
//        hour = keyboard.nextInt();
//
//        System.out.println("What is your hours pay rate");
//        payRate = keyboard.nextDouble();
//
//        grossPay = hour * payRate;
//
//        System.out.println("Hello, " + name);
//        System.out.println("your gross pay is $" + grossPay);
//
//        int a,b;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Nhap a va b");
//        a = keyboard.nextInt();
//        b = keyboard.nextInt();
//
//        System.out.println("Tong a va b: " + (a + b) );
//
//        int soNguyen;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Nhap so nguyen: ");
//        soNguyen = keyboard.nextInt();
//
//        if(soNguyen % 2 == 0) {
//            System.out.println("So nguyen nay la chan " );
//        } else {
//            System.out.println("So nguyen nay la so le " );
//        }
//
//        double a,b;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Nhap a va b");
//        a = keyboard.nextDouble();
//        b = keyboard.nextDouble();
//
//        //ax + b = 0
//
//        if(a == 0) {
//            if (b == 0) {
//                System.out.println("PT co vo so nghiem");
//            }else {
//                System.out.println("PT vo nghiem");
//            }
//        } else {
//            System.out.println("PT co 1 nghiem: x = " + (-b/a) );
//        }
//
//        int so;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.println("Nhap so tu 2 den 5");
//        so = keyboard.nextInt();
//
//        switch (so) {
//            case 2:
//                System.out.println("Hai");
//                break;
//            case 3:
//                System.out.println("Ba");
//                break;
//            case 4:
//                System.out.println("Bon");
//                break;
//            case 5:
//                System.out.println("Nam");
//                break;
//            default:
//                System.out.println("Nhap Sai!");
//        }
//
//        int i = 1;
//        while (i < 5) {
//            System.out.println("Hello");
//            i++;
//
//        }
//        System.out.println("The end!!!");
//
//        int n, S= 0;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Nhap n: ");
//        n = keyboard.nextInt();
//
//        for (int i = 1 ; i < n ;i++) {
//            S = S + i;
//            System.out.println("S: "+ S);
//        }
//
//        int n;
//        Scanner keyboard = new Scanner(System.in);
//
//        System.out.print("Nhap n: ");
//        n = keyboard.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(j + "\t");
//            }
//            System.out.print("\n");
//        }
//
//        int n;
//        Scanner keyboard = new Scanner(System.in);
//        do
//        {
//            System.out.print("Nhap vao mot so nguyen duong: ");
//            n = keyboard.nextInt();
//            if(n  <=  0)
//            {
//                System.out.println("Nhap sai. Nhap lai  !!!");
//            }
//        }while(n <= 0);
//        System.out.println("Ban da nhap dung. Ket thuc chuong trinh");
//
//        int i = 1;
//
//        do {
//            System.out.println("Xin chao " );
//            i++;
//        }while (i <= 6);
//
//        int a = 18;
//        for(int i = 1; i <= a; i++)
//        {
//            if(a % i == 0)
//            {
//                System.out.print(i  + "\t");
//            }
//        }
//
//        for(int i = 0; i < 5; i++)
//        {
//            for(int j = 0; j <= i; j++)
//            {
//                System.out.print(j + "\t");
//            }
//            System.out.print("\n");
//        }
//
//        int i = 10, s = 0;
//        while(i > 0)
//        {
//            if(i % 2 == 0)
//            {
//                s += i;
//            }
//            else
//            {
//                if(i > 5)
//                {
//                    s += 2 * i; //tuc la s = s + 2 * i
//                }
//            }
//            i--;
//        }
//        System.out.print("s = " + s);
//
//        int a = 18, i = 1;
//        do
//        {
//            if(a % i == 0)
//            {
//                System.out.print(i  + "\t");
//            }
//            i++;
//        }while(i <= a);
//
//        int n;
//
//        Scanner keyboard = new Scanner(System.in);
//
//        while (true) {
//            System.out.print("Nhap so nguyen: ");
//            n = keyboard.nextInt();
//            if ( n <= 0 ) {
//                System.out.println("Ket thuc vong lap");
//                break;
//            }
//        }
//
//        for (int i = 10 ; i <= 20 ; i++ ){
//            if(i == 13 || i == 17 ) {
//                continue;
//            }
//            System.out.println(i + "\t");
//        }
//        System.out.println("Bye");
//
//        int a = 11, b = 16, i = a;
//        while( i < b )
//        {
//            if(i % 2 == 0)
//            {
//                System.out.print(i  + "\t");
//                break;
//            }
//            i++;
//        }
//
//        int a = 10, s = 0, i = 0;
//        while( i < a )
//        {
//            i++;
//            if (i % 2 == 0)
//            {
//                continue;
//            }
//            s += i;
//        }
//        System.out.print(" s = " + s);
//
//        int i = 1, s = 0;
//        while(true)
//        {
//            s = s + i++;
//            if (i % 2 == 0) //tuc i % 2 == 0
//            {
//                i = i + 2;
//            }
//            else
//            {
//                i = i + 1;
//            }
//            if (i > 20)
//            {
//                break;
//            }
//            System.out.print(" s =  " + s);
//        }
//
//        corectMethod();
//
//        String again = "y";
//        int die1;
//        int die2;
//
//        Scanner keyboard = new Scanner(System.in);
//        Random rand = new Random();
//
//        while (again.equalsIgnoreCase("y")){
//            System.out.println("Rolling dice......");
//            die1 = rand.nextInt(6) + 1;
//            die2 = rand.nextInt(6) + 1;
//            System.out.println("Their value are: ");
//            System.out.println(die1 + "" + die2);
//
//            System.out.println("Roll them again (y = yes)?");
//            again = keyboard.nextLine();
//        }
//
//
//
//
//
//
//    }
//    public static void corectMethod() {
//        int x = 1;
//        int y = 1 ;
//        for (int i = 1; i < 10; i++) {
//            x += i;
//            System.out.println("x: " + x);
//        }
//
//        for (int i = 1; i < 10; i++) {
//            y += i;
//            System.out.println("y: " + y);
//        }
//
//    }
//
//}
