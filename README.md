# CSCI-3501-Lab4  Cassie Schultz and David


##Explanation of the algorithm
* General overview: 
    Our algorithm takes in an array of items to be packed, and the bin capcacity.
    The array of items is then sorted in reverse order so that the biggest items are to be 'packed' first. The idea behind this is that the big items will be packed while
    the bins still have large spaces open, and the smaller items will then be able to fill in the smaller cracks.  
    a for loop iteraties thorugh all of the items and puts them into a while loop which
    checks to see if the value of the current item is less than the available unpacked space of the current bin (and therefore will fit into said bin).
    if the item will fit, the item is placed into the bin, the unpacked space is updated to reflect the addition of the bin, and the algorithm moves onto the next sortable item. 
    If the check reveals the current item will *not* fit into the current bin, a new bin is created, and the item is placed into the newly created bin, 
    then the algorithm procedes to the next sortable item.  


* Edge cases and notes
    Our algorithm packs all packable items, that is, the only case that an item is not packed, is if it is too large to fit into the given bin capacity.
    Our algorithm utilizes the 'Bins' class that we created to; add items, update space in bins, and aid in offering the user readable output. 
    The Bin objects store the items in an array list. 
     
##Explanation of best/worst case
* The Best case
    Our algorithm offers a nice solution for the bin when there are many small numbers in the array that allow for spaces to be easily filled.  This can be seen in example 4 (see Test Reuslts section).  Here we can see 
    that the algorithm places the couple of big numbers first, then fills in the cracks with the smaller numbers.  Because the array in the example has many 1 value 
    items, and 2 value items, it is easier to fill in empty space, and being left with small numbers at the end makes it easier for the algorithm 
    to fill the last bin, without the need to create more unneeded bins.  

* The Worst case 
    Our algorithm offers a fine, but not optimal solution when given an list of numbers in increasing order, this can be seen in examples 2 and 3 (refer to Test Results section).
    This is because the algorithm chooses the *first* possible space for the item to fit in, not the *best* possible space.  One can look to example 3 and make a few changes that results
    in a better solution to the problem by switching around the contents of the bins.  This idea is not considered by the algorithm though, as it packs the largest items first,
    and uses the smaller items to fill in the spaces.  This idea becomes more flawed when the optimal solution lies in the grouping of these smaller numbers.  The algorithm also 
    creates a bin for each object no matter what.  This means that if there is an item of a low value left over, the algorithm will create a whole new bin to fit this item,
    when in reality it may make more sense to refrain from packing the item instead.  

##Explanation of efficiency 
* O(n) = n lg(n) 
    1.) array is sorted in reverse order = nlg(n) 
    2.) '''for()'''  goes through all n items = n
    3.) '''while()''' finds bin for item (item can go through '''while()''' a max of two times ) = 2n
    4.) '''output()''' n   
    so .... T(n) = nlg(n) + n + 2n + n ==> O(nlg(n))
    Because nlg(n) is the dominating term, We have calculated the runtime of our algorithm to be O(nlgn).  The nlg(n) comes from the sort that needs to be 
    done at the begining of the algorithm, before the binpacking even starts. Threfore the runtime here depends on the runtime of the sort used. 
    The sort at the begning is crucial to making the algorithm work properly.  We calculated the nested '''while()''' of the algorithm 
    to be 2n, because the worst case would be that each item needs to run through the while loop twice, there is no way for an item to run
    through the while loop more times than two. One way we could imporve the efficency of this algorithm would be to make sure 
    we are utilizing the best sorting algorithm for this situation.    


##Test Results

* Example 1: Random list of 30 random numbers (0-20)
    Bin 0: [19, 0, 0, 0] space remaining: 1
    Bin 1: [18, 2] space remaining: 0
    Bin 2: [18] space remaining: 2
    Bin 3: [16, 4] space remaining: 0
    Bin 4: [16, 3] space remaining: 1
    Bin 5: [16] space remaining: 4
    Bin 6: [15, 5] space remaining: 0
    Bin 7: [15, 5] space remaining: 0
    Bin 8: [14, 6] space remaining: 0
    Bin 9: [14] space remaining: 6
    Bin 10: [13] space remaining: 7
    Bin 11: [13] space remaining: 7
    Bin 12: [12, 8] space remaining: 0
    Bin 13: [12, 8] space remaining: 0
    Bin 14: [11, 9] space remaining: 0
    Bin 15: [11] space remaining: 9
    Bin 16: [11] space remaining: 9
    Bin 17: [10] space remaining: 10

    all items were packed

    *Total unused space: 56
 * Example 2: ordered list of numbers (Bin Capacity = 20)
    Ordered list of numbers
    Bin 0: [14, 6, 0] space remaining: 0
    Bin 1: [13, 7] space remaining: 0
    Bin 2: [12, 8] space remaining: 0
    Bin 3: [11, 9] space remaining: 0
    Bin 4: [10, 5, 4, 1] space remaining: 0
    Bin 5: [3, 2] space remaining: 15

    all items were packed

    Total unused space: 15


* Example 3: non-Optimal example (An ordered list from 0-15)
    Bin 0: [15, 5] space remaining: 0
    Bin 1: [14, 6] space remaining: 0
    Bin 2: [13, 7] space remaining: 0
    Bin 3: [12, 8] space remaining: 0
    Bin 4: [11, 9] space remaining: 0
    Bin 5: [4, 3, 2, 1] space remaining: 10

    items unpacked: [190]

    Total unused space: 10


*  Example 4: Optimal example 
    Bin 0: [20, 0] space remaining: 0
    Bin 1: [19, 1] space remaining: 0
    Bin 2: [16, 4] space remaining: 0
    Bin 3: [15, 5] space remaining: 0
    Bin 4: [15, 5] space remaining: 0
    Bin 5: [12, 8] space remaining: 0
    Bin 6: [12, 8] space remaining: 0
    Bin 7: [10, 10] space remaining: 0
    Bin 8: [9, 7, 4] space remaining: 0
    Bin 9: [6, 6, 6, 2] space remaining: 0
    Bin 10: [4, 3, 3, 3, 3, 3, 1] space remaining: 0

    all items were packed

    Total unused space: 0

## Sources 

* Sources: 
    We used this source for reverse sorting array: https://www.java67.com/2016/07/how-to-sort-array-in-descending-order-in-java.html
    for help on scanner class and input: https://stackoverflow.com/questions/7646392/convert-string-to-int-array-in-java
    Algorithm for packBin() is based on algorithm from: https://security-consulting.icu/blog/2014/08/bin-packing-algorithm-java/

