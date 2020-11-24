 public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("Apple");
    set.add("Orange");
    set.add("Grapes");
    System.out.println("HashSet: "+ set);
    
    String[] array = new String[set.size()];
    set.toArray(array);
    
    System.out.println("Array elements: ");
    array.forEach(fruit -> {
        System.out.println(fruit);
    });
 }
