public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }


    /**
     * Havlayan Köpek
     */

        public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay) {
            if (!dogBarking || hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            if (hourOfDay < 8 || hourOfDay >= 20) {
                return true;
            }
            return false;
        }




    /**
     * Yaş Tespiti
     */

        public static boolean hasTeen(int param1, int param2, int param3) {
            if (param1 >= 13 && param1 <= 19 || param2 >= 13 && param2 <= 19 || param3 >= 13 && param3 <= 19) {
                return true;
            } else {
                return false;
            }

        }

    /**
     * Oynayan kedi
     */
        public static boolean isCatPlaying(boolean isSummer, int temp) {
            if (isSummer) {
                return temp > 25 && temp <= 45;
            }
            return temp > 25 && temp <= 35;
        }

    /**
     * Alan Hesaplama
     */

        public static double area(double x, double y) {
            if (x <= 0 || y <= 0) {
                System.out.println("Alan degerleri sıfırdan büyük olmalidir.");
                return -1;
            }
            return x * y;
        }
        public static double area(double radius) {
            if (radius < 0) {
                System.out.println("Alan degerleri sıfırdan büyük olmalidir.");
                return -1;
            }
            return radius*radius*Math.PI;
        }

    public static void main(String[] args) {
        System.out.println("ShouldWakeUp----------");
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("HasTeen----------");
        System.out.println(hasTeen(9, 9, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println("CatPlaying---");
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println("Rectanglearea----");

//        Scanner scanner = new Scanner(System.in);
//        boolean isValid = false;
//        while (isValid) {
//            try {
//                System.out.println("Enter width of rectangle:");
//                double x = scanner.nextDouble();
//                System.out.println("Enter height of rectangle:");
//                double y = scanner.nextDouble();
//                double result = area(x, y);
//                System.out.println("area =" + result);
//            } catch (Exception ex) {
//                isValid = false;
//                System.out.println("Invalid Input");
//            }
//        }
//        System.out.println("----CircleArea----");
//        try {
//            System.out.println("Enter radius of circle:");
//            double radius = scanner.nextDouble();
//            System.out.println(area(radius));
//        } catch (Exception ex) {
//            System.out.println("Invalid Input");
//        }

    }


    }


