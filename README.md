# RadixSort
Java Radix-Sort Object Orientated
Public Methods
---------------------------------------
in(int[]) pass in a list to be sorted.

getSorted() returns int[] 

---------------------------------------
Private Methods
---------------------------------------
buildQueue() this builds an ArrayList of 9 queues<Integer>
  
queueToMain() This empties all the queues into mainbin.
  
addToQueue(tmp,place) This adds an int to a que base on tenths place
  
getTensPlace(tmp,place) This gets the number in a specified tenths place.
  
sort() This sorts the list via radix.
 
pop() This returns the first item from the mainbin queue then removes it from the queue.
  
-----------------------------------------
  Radix sort uses 10 queues to sort numbers
-------------------------------------------
  How to use
  
  Radix OBJNAME = new Radix();
  
  OBJNAME.in(new int[]{?,?,?,?});
  
  OBJNAME.getSorted();
  
  or 
  
  Radix OBJNAME = new Radix(new int[]{?,?,?,?});
