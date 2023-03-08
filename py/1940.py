import sys
sys.stdin = open("input.txt","r")

t = int(input())

for test_case in range(1, 1+t):
    num = int(input())
    distance = 0 # 거리의 합
    a = 0 # 가속도
    v = 0 # 현재 속도
    for i in range(num):
        c = list(map(int, input().split()))
        if c[0] == 0:
            distance += v
        elif c[0] ==1:
            a = c[1]
            v += a
            distance += v
        elif c[0]==2:
            a = c[1]
            v -= a
            if v<0:
                v = 0
            distance += v
    print(f"#{test_case} {distance}")