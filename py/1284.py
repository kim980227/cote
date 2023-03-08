import sys
sys.stdin = open("input.txt","r")

t = int(input())
for test_case in range(1,t+1):
    li = list(map(int, input().split()))

    P=li[0]
    Q=li[1]
    R=li[2]
    S=li[3]
    W=li[4]
    A_pay = P*W
    B_pay = Q
    if W > R:
        B_pay += (W-R)*S
    if A_pay >= B_pay:
        print(f"#{test_case} {B_pay}")
    else:
        print(f"#{test_case} {A_pay}")
