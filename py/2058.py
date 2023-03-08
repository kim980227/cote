import sys
sys.stdin = open("input.txt", "r")

s= list(map(int, input()))
sum = 0
for i in s:
    sum += i
print(sum)