import java.util.HashSet;
import java.util.Set;
public class UseOfSets {
    public static void main(String[] args) {
        String[] listA = {"Ann", "Sally", "Jill", " Mary"};
        String[] listB = {"Bob", "Bill", "Ann", "Jill"};
        Set<String> setA = new HashSet<String>();	 	
        Set<String> setAcopy = new HashSet<String>(); 		 
        Set<String> setB = new HashSet<String>();       
        for (int i = 0; i < listA.length; i++) { setA.add(listA[i]);}
        for (int i = 0; i < listB.length; i++) { setB.add(listB[i]);}
        setAcopy = setA;					
        setA.retainAll(setB); 				
        System.out.println("setA: " + setA);
        System.out.println("setB: " + setB);
        System.out.println("setAcopy: " + setAcopy);
    }
}
