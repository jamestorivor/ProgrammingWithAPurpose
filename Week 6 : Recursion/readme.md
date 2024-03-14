# Explanation for Reve's Puzzle solution

<img width="923" alt="Screenshot 2024-03-15 at 1 41 41 AM" src="https://github.com/jamestorivor/ProgrammingWithAPurpose/assets/101387980/37708e40-2d64-42c5-b083-1c4cca57fcef">

## Explanation of each of the statements in the algorithm

`Transfer (recursively) the k smallest discs to a single pole other than the start or destination poles.`
We need to first transfer all the k smallest disc via recursion. 

let n = 8.
K would be = 5, so how do we move 5 of the smallest discs ? 
we will do that by moving the k smallest discs of K, meaning we will let K be the new n.

we will repeat this process (this is what is meant by recursively) until we are able to create a base case. 
For this problem, the base case will be when n = 1 and n = 2 where moving 1 and 2 discs will always be done in the same manner.

`Transfer the remaining n−k disks to the destination pole (without using the pole that now contains the smallest k discs). To do so, use the algorithm for the 3-pole towers of Hanoi problem.`
When n = 1 and the smallest disc is now on a pole that is not the destination pole ( either B or C ). The pole with the smallest disc is now unusable, thus we can simply hanoi the n-k discs using the remaining 3 poles.

`Transfer (recursively) the k smallest discs to the destination pole.`
Finally, we move the smallest disc on top of the new stack.

Thus it will look like this
n = 8 , k = 5
  n = 5, k = 3
    n = 3 , k = 1
      n = 1, move the smallest disc to pole B (or C), return.
    hanoi discs 2 and 3 to the dest pole and move the k smallest disc (1) from B to D. 1,2,3 (the smallest discs are on pole D)
  hanoi discs 4 and 5 to the dest pole and move the k smallest discs (3) (previously completed)
hanoi discs 6,7,8 to the dest pole and move the k smallest discs (5) to pole D. 


      
    

