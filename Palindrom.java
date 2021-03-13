
/**
 * Beschreiben Sie hier die Klasse Palindrom.
 * 
 * @author dt 
 * @version 0.1
 */
public class Palindrom
{
    private Stack<Character> stack;
    private Queue<Character> queue;
    private char[] array;
    // Konstruktor
    public Palindrom()
    {
        stack = new Stack<Character>();
        queue = new Queue<Character>();
    }

    public boolean palidromPruefen(String wort){
        boolean merker = true;
        array = wort.toCharArray(); // hier steht nun das Wort in einzelnen Buchstaben als CHAR
        // da char ein primitiver Datentyp ist gehen vergleich wie bei zahlen: ==, !=,  < und >
        for(int i=0;i<array.length;i++){
            stack.push(new Character(array[i]));
            queue.enqueue(new Character(array[i]));

        }
        while(!stack.isEmpty()){
            if(stack.top().equals(queue.front())){
                stack.pop();
                queue.dequeue();
            }
            else {
                stack.pop();
                queue.dequeue();
                merker = false;
            }
        }
        return merker;
    }

}
