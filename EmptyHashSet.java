public static void main(String args[]) 
    { 
      HashSet<String> set = new HashSet<String>(); 
      set.add("Apple");
      set.add("Orange");
      set.add("Grapes");
      System.out.println("HashSet: " + set); 
      
      set.clear(); 
      System.out.println("The final set: " + set); 
    }
