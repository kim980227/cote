import sys

sys.stdin = open("input.txt", "r")
t = int(input())
for test_case in range(1, t + 1):
    lst_str = []
    n = int(input())
    answer = " "
    print(f"#{test_case}")
    cnt = 0
    for p in range(n):
        li = list(map(str, input().split()))

        for i in range(int(li[1])):
            lst_str.append(li[0])

    for j in lst_str:
        print(j, end="")
        cnt += 1
        if cnt > 9:
            print()
            cnt = 0
