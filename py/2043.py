import sys
sys.stdin = open("input.txt","r")

count = 0

t= list(map(int,input().split(" ")))

while 1:
    count += 1
    if t[0] == t[1]:
        break
    else:
        t[1] += 1

print(count)