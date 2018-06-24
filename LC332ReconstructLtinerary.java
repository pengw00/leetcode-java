package com.tutorialspoint;

import java.util.*;

public class LinkedListDemo {
    public static Map<String, PriorityQueue<String>> flights;
    public static LinkedList<String> path;
    public static List<String> findItinerary(String[][] tickets) {
        flights = new HashMap<>();
        path = new LinkedList<>();
        for(String[] ticket:tickets){
            flights.putIfAbsent(ticket[0], new PriorityQueue<>());
            flights.get(ticket[0]).add(ticket[1]);
        }
        DFS("JFK");
        return path;
    }
    public static void DFS(String departure){
        PriorityQueue<String> arrivals = flights.get(departure);
        while(arrivals != null && !arrivals.isEmpty()){
            DFS(arrivals.poll());
        }
        path.addFirst(departure);
    }
    
   public static void main(String[] args) {
       String[][] tickets = new String[][] {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
      // create a LinkedList
      List<String> path1 = findItinerary(tickets);
      System.out.println(findItinerary(tickets));
      System.out.println(Arrays.deepToString(tickets));
      LinkedList list = new LinkedList();

      // add some elements
      list.add("Hello");
      list.add(2);
      list.add("Chocolate");
      list.add("10");

      // print the list
      System.out.println("LinkedList:" + list);

      // add a new element at the beggining of the list
      list.addFirst("Element");

      // print the new list
      System.out.println("LinkedList:" + list);
   }
}
