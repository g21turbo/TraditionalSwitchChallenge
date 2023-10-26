public class Main {
    public static void main(String[] args) {

        char charVariable = 'Z';

        switch (charVariable) {
            case 'A':
                System.out.println("A is Alpha");
                break;
            case 'B':
                System.out.println("B is Bravo");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Delta");
                break;
            case 'E':
                System.out.println("E is Echo");
                break;
            default:
                System.out.println("Letter " + charVariable + " was not found");
                break;
        }
    }
}