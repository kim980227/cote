import sys
sys.stdin = open("input.txt","r")

t = int(input())
result = t
for i in range(0,t+1):
    result = t-i
    print(result,end=" ")