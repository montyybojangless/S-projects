//HashMap solution to frist non repeating character given within an array of characters 
// Example Array = {a,a,a,b,b,b,c,c,c,d,e,e,e,f,f,f}
// O(2n) simplified O(n)
class hashmap{
    char firstNonRepeatingCharacter(String s){
        HashMap<Character, integer> charCounts = new HashMap();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(charCounts.containsKey(c)){ charCounts.put(c, charCounts.get(c) + 1;}
            else { charCounts.put(c, 1);}
            
        for(int i = 0; i < s.length(); i++){ char.c = s.charAt(i);
        if(charCounts.get(c) == 1) return c;}
    }
}