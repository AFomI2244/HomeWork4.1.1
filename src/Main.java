public class Main {
    public static void main(String[] args) {
        //Домашнее задание - 1, 2.
        //Задание 1
        System.out.println("Домашнее задание- 1, 2");
        System.out.println("Задание 1.");
        int age = 21;
        if (age >= 18) {
            System.out.println("С совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил. Пожалуйста, подождите.");
        }

        //Задание 2
        System.out.println("Задание 2.");
        int person = 15;
        if (person >= 7 && person < 18) {
            System.out.println("Ребенок ходит в школу.");
        } else if (person >= 18 && person < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        } else if (person >= 24) {
            System.out.println("Человек окончил университет и ему пора искать работу.");
        }

        //Задание 3
        System.out.println("Задание 3.");
        int place = 105;
        if (place <= 60) {
            System.out.println("В вагоне есть место: сидячее.");
        } else if (place >= 60 && place <= 102) {
            System.out.println("В вагоне есть место: стоячее.");
        } else if (place > 102) {
            System.out.println("В вагоне мест нет.");
        }

        //Домашнее задание - 3
        //Задание 1
        System.out.println("Домашнее задание- 3");
        System.out.println("Задание 1.");
        int yearsOld = 17;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу");
        } else if (yearsOld >= 18 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то его место в университете");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить на работу");
        }

        //Задание 2
        System.out.println("Задание 2.");
        if (yearsOld < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе.");
        } else if (yearsOld >= 5 && yearsOld < 14) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении взрослого.");
        } else if (yearsOld >= 14) {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого.");
        }

        //Задание 3
        System.out.println("Задание 3.");
        int one = 511;
        int two = 1115;
        int free = 22;
        if (one > two) {
            if (one >= free) {
                System.out.println("БОльшее число - " + one);
            } else {
                System.out.println("БОльшее число - " + free);
            }
        } else if (two > one) {
            if (two >= free) {
                System.out.println("БОльшее число - " + two);
            } else {
                System.out.println("БОльшее число - " + free);
            }
        } else {
            if (one > free) {
                System.out.println("БОльшее число - " + one);
            } else if (free > one) {
                System.out.println("БОльшее число - " + free);
            } else {
                System.out.println("Все три числа равны между собой");
            }
        }
    }
}