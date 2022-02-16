import java.util.Scanner;

class Ex extends Thread
    {
        String name;
        Ex(String name)
        {
            this.name=name;
            start();
        }
        public void run()
        {
            try{
                System.out.println("888888   **       **   88      88");
                Thread.sleep(100);
                color(1);
                System.out.println("  88     *  *   *  *    88    88");
                Thread.sleep(100);
                color(2);
                System.out.println("  88      *   *   *       8  8");
                Thread.sleep(100);
                color(4);
                System.out.println("  88       *     *         88");
                Thread.sleep(100);
                color(6);
                System.out.println("  88         * *           88");
                Thread.sleep(100);
                color(7);
                System.out.println("888888        *            88");
                Thread.sleep(100);
                color(4);
                System.out.println();
                System.out.println("I love You ...."+name);
                System.out.println("  \\___/ ");
                Thread.sleep(100);
                color(1);
                System.out.println("  ('>')");
                Thread.sleep(100);
                color(2);
                System.out.println("        /-----\\");
                Thread.sleep(100);
                color(3);
                System.out.println("  ___         /   |   \\");
                Thread.sleep(100);
                color(4);
                System.out.println(" (^ ^)  _|*|_     |    ");
                Thread.sleep(100);
                color(5);
                System.out.println("  ^^^  /          |");
                Thread.sleep(100);
                color(6);
                System.out.println("    \\ /          / \\");
                Thread.sleep(100);
                color(7);
                System.out.println("   /|/|         /   \\");
                Thread.sleep(100);
                color(8);
                System.out.println("   \\|/ ");
                Thread.sleep(100);
                color(9);
                System.out.println("    | /|_");
                Thread.sleep(100);
                color(10);
                System.out.println("    |/  ");
                Thread.sleep(100);
                color(11);
                System.out.println("   / ");
                Thread.sleep(100);
                color(12);
                System.out.println("   |");
                Thread.sleep(100);
                color(13);

                System.out.println("yes or no life is depend in You plz answer By heart ...");
                String s=new Scanner(System.in).next();
                if(s.equals("yes"))
                {
                    System.out.println("bas ab tu hi tu");

                    System.out.println("         /~____\\    \\|/");
                    Thread.sleep(100);
                    color(4);
                    System.out.println(" /_/^  ^|    //");
                    Thread.sleep(100);
                    System.out.println("    \\|/   _\\ - /_  //");
                    Thread.sleep(100);
                    System.out.println("     \\   / \\/  \\  //");
                    Thread.sleep(100);
                    System.out.println("      \\\\//      |//");
                    Thread.sleep(100);
                    System.out.println("  |      |");
                    Thread.sleep(100);
                    System.out.println("         |======|");
                    Thread.sleep(100);
                    System.out.println("  |      |");
                    Thread.sleep(100);
                    System.out.println("        ( )   ( )");
                    Thread.sleep(100);
                    System.out.println(" | |   | |");
                    Thread.sleep(100);
                    System.out.println(" |_|   |_|");
                    Thread.sleep(100);
                    System.out.println(" [_]   [__\\");
                    Thread.sleep(100);
                    System.out.println(":-> :> ;-> ........");//AP
                }
                else
                {
                    System.out.println("dil gaye muje chihiye tera pyar"+s);

                    System.out.println("         /~____\\    \\|/");
                    Thread.sleep(100);
                    color(1);
                    System.out.println(" /_/x  x|    //");
                    Thread.sleep(100);
                    color(2);
                    System.out.println("    \\|/   _\\ - /_  //");
                    Thread.sleep(100);
                    color(3);
                    System.out.println("     \\   / \\/  \\  //");
                    Thread.sleep(100);
                    color(4);
                    System.out.println("      \\\\//      |//");
                    Thread.sleep(100);
                    color(5);
                    System.out.println("  |      |");
                    Thread.sleep(100);
                    color(6);
                    System.out.println("         |======|");
                    Thread.sleep(100);
                    color(7);
                    System.out.println("  |      |");
                    Thread.sleep(100);
                    color(7);
                    System.out.println("        ( )   ( )");
                    Thread.sleep(100);
                    color(8);
                    System.out.println(" | |   | |");
                    Thread.sleep(100);
                    color(9);
                    System.out.println(" |_|   |_|");
                    Thread.sleep(100);
                    color(1);
                    System.out.println(" [_]   [__\\");
                    Thread.sleep(100);
                    color(2);
                }
            }catch(Exception e){System.out.println("By AP(arpit and pradip)");};
        }
        public void color(int c)throws Exception
        {
            new ProcessBuilder("cmd","/c","color "+c).inheritIO().start().waitFor();
        }
        public static void main(String a[])
        {
            Ex e=new Ex(a[0]);
            //Enter a name of person who make or change your life (By AP (arpit & pradip))
        }
    }

