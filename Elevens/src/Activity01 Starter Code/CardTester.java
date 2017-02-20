/**
 * This is a class that tests the Card class.
 */
public class CardTester 
{
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    
    public static void main(String[] args) 
    {
        Card one = new Card("King", "Diamonds", 13);
        System.out.println(one);
        System.out.println("The rank is: " + one.rank());
        System.out.println("The suit is: " + one.suit());
        System.out.println("The point value is: " + one.pointValue());
        
        Card two = new Card("Seven", "Spades", 7);
        System.out.println(two);
        System.out.println("The rank is: " + two.rank());
        System.out.println("The suit is: " + two.suit());
        System.out.println("The point value is: " + two.pointValue());
        
        Card three = new Card("Three", "Hearts", 13);
        System.out.println(three);
        System.out.println("The rank is: " + three.rank());
        System.out.println("The suit is: " + three.suit());
        System.out.println("The point value is: " + three.pointValue());
    }
}
