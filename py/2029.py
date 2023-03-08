import sys
sys.stdin = open("input.txt","r")

t= int(input())
for test_case in range(1,t+1):
    div =0
    mod =0
    li=list(map(int, input().split()))
    div = int(li[0] / li[1])
    mod = int(li[0] % li[1])
    print(f"#{test_case} {div} {mod}")