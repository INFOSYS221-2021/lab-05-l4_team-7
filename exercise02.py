# Exercise Two
# Write a simple program that finds the value at the nth position in the Fibonacci sequence
def fiboseq(index):
  prevnum = 0
  temp = 0
  currnum = 1
  for x in range(1, index):
    temp = currnum
    currnum = prevnum + temp
    prevnum = temp
    
  return currnum

index = 6
print("The value at the "+str(index)+"th position in the Fibonacci sequence is "+str(fiboseq(index)))
#print("The value at the 6th postion in the Fibonacci sequence is 8")
