# CuteCyclopsCult

## Team members:
- Faiza Huda
- Huebert
- Truthful Tom
- Mary
- Tasnim Chowdhury
- Rin Fukuoka
- Tape
_____________________
#### Tests Performed
- 100 trials of 750,000 items for both Linear and Binary. Then averages get computed and are compared with one another: Which one is faster and by how much?
- The above is also repeated for 100,000,000 items.


#### Results
After running our program 20 times with 100 trials for each search algorithm, we have collected the following data:

750,000 items:
- 66% of the time binary and linear have the same time
- For the other 33% of the time, binary is faster on average of 1 milisecond

100,000,000 items:
- In every time we have run the programs, binary was undoubtably faster
- With an average of 72 miliseconds faster


#### Conclusions
When it comes to small sized arrays, around less than 1 million, it takes both Linear and iterative Binary search algorithms roughly the same time. However, once the arrays start to become bigger, in our case, 100 million, it becomes apparent that Binary search is more efficient. Thusly, our hypothesis has been proven correct.