# Exercise Three
# Write a simple program that finds the number of digits of a given integer value
def countdig(num):
  count = 0
  if num < 0:
    count = -1
  for x in str(num):
    count += 1
  return count
num = 100
print("The number of digits for a value of "+str(num) + " is " +str(countdig(num)))
#print("The number of digits for a value of 100 is 3")
