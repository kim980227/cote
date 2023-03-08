import sys
sys.stdin = open("input.txt","r")

t= int(input())
op = 1
print(op,end=" ")
for i in range(1,t+1):
    op *= 2
    print(op,end=" ")