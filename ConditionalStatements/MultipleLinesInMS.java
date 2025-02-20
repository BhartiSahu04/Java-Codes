package Basics.src.ConditionalStatements;

public class MultipleLinesInMS {
    public static void main(String [] args){
        int number = 90 ;
        switch(number){
            case 1->{
                System.out.println("This is first day of the week");
                System.out.println("Its Monday Guys");
            }
            case 2->{
                System.out.println("This is Second day of the week");
                System.out.println("Its Tuesday Guys");
            }
            case 3->{
                System.out.println("This is Third day of the week");
                System.out.println("Its Wednesday Guys");
            }
            case 4->{
                System.out.println("This is fourth day of the week");
                System.out.println("Its Thursday Guys");
            }
            case 5->{
                System.out.println("This is fifth day of the week");
                System.out.println("Its Friday Guys");
            }
            case 6->{
                System.out.println("This is sixth day of the week");
                System.out.println("Its Saturday Guys");
            }
            case 7->{
                System.out.println("This is seventh day of the week");
                System.out.println("Its Sunday Guys");
            }
            default->{
                System.out.println("Wrong Input");
                System.out.println("this is not the week day");
            }


        }
    }
}
