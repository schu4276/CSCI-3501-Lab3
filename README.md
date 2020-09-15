# CSCI-3501-Lab4
##Questions for Peter
* Ask about ```Collections.reverseOrder()```
* Ask about ```while()```
* Ask about big O
* Ask about test size

##Explanation of the algorithm
* General overview: 
    Our algorithm takes in an array of items to be packed, and the bin capcacity.
    The array of items is then sorted in reverse order so that the biggest items are to be 'packed' first.
    a for loop iteraties thorugh all of the items and puts them intoa while loop which
    checks to see if the value of the current item, is less than the unpacked space of the current bin (and therefor will fit into said bin).
    if the item will fit, the item is placed into the bin, the unpacked space is updated, and the algorithm moves onto the next sortable item. 
    If the check reveals the current item will not fit into the current bin, a new bin is created, and the item is placed into the newly created bin, 
    then the algorithm procedes to the next sortable item.  
* Edge cases and notes
    Our algorithm packs all packable items, the only case that an item is not packed, is if it is too large to fit into the given bin capacity.
    Our algorithm utilizes the 'Bins' class that we create to add items, update space in bins, and aid in offering the user readable output. 
    The Bin objects store the items in an array list. 
##Explanation of best/worst case
* The Best case
    Our algorithm offers a nice solution for the bin packing problem whem the sum of the item values mod bin capacity is close to the capacity. 
    This has to do with our choice to pack all packable items. This can be seen in test example ( ..............)
* The Worst case 
    Our algorithm offers a less nice solution for the bin packing probem when the sum of the item values mod the bin capcity is a relativly low number.
    This can be seen in test example (............)
##Explanation of efficiency 
*T(n) = nlg(n) + n + 2n + n 
    Because nlg(n) is the dominating term, We have calculated the runtime of our algorithm to be O(nlgn).  The nlg(n) comes from the sort thta needs to be 
    done at the begining of the algorithm, before the binpacking even starts.  The sort at the begning is crucial to making the algorithm work properly.  
    We calculated the nested while loop of the algorithm to be 2n, because the worst case would be that each item needs to run through the while loop twice, 
    there is no way for an item to run through the while loop more times than two. One way we could imporve the efficency of this algorithm would be to make sure 
    we are utilizing the best sorting algorithm for this situation.    

##Sources

##Test Results