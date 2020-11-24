public static void main(String args[]){
  HashSet<String> set = new HashSet<String>();
  set.add("Apple");
  set.add("Orange");
  set.add("Grapes");
  set.add("Lemon");
  set.add("Rose");
  set.add("Jasmine");
  
  System.out.println(set);
  
  HashSet<String> subSet = new HashSet<String>();
  subSet.add("Rose");
  subSet.add("Jasmine");
  
  set.retainAll(subSet);
  System.out.println(set);
}
