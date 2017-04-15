             Time       Space
insertion    n^2        1

selection    n^2        1

merge        n logn     n + logn

quick        n logn     logn

radix        n+r        n+r+1


Radix Sort
step 1 - count
step 2 - cumilate
step 3 - re-arrnge

array - 1, 2, 3, 1, 2, 3, 8, 7, 9, 1
range is 0-9

step 1
count[] - size is 1 more than range

for(i in array)
  count[arr[i]+1]++

0 1 2 3 4 5 6 7 8 9 10
0 0 3 2 2 0 0 0 1 1 1

step 2

for(i in count)
  count[i] = count[i] + count[i-1]

0 1 2 3 4 5 6 7 8 9 10
0 0 3 5 7 7 7 7 8 9 10

step 3
aux[] - same size as array

for(i in array)
  aux[count[arr[i]]] = arr[i]
  count[arr[i]]++
