import sys
sys.stdin = open("input.txt","r")

t = int(input())
for i in range(1, t+1):
    if t%i == 0:
        print(i,end=" ")