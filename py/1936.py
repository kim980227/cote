import sys
sys.stdin = open("input.txt","r")

li = list(map(int, input().split()))

if li[0]==1:
    if li[1]==1:
        print("draw")
    elif li[1]==2:
        print("B")
    elif li[1]==3:
        print("A")
    else:
        print("out of bound")
elif li[0]==2:
    if li[1] == 1:
        print("A")
    elif li[1] == 2:
        print("draw")
    elif li[1] == 3:
        print("B")
    else:
        print("out of bound")
elif li[0]==3:
    if li[1] == 1:
        print("B")
    elif li[1] == 2:
        print("A")
    elif li[1] == 3:
        print("draw")

    else:
        print("out of bound")
else:
    print("out of bound")