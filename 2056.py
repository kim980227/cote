import sys
sys.stdin = open("input.txt","r")

T=int(input())
md = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
for test_case in range(1,T+1):
    s = input()
    print(f"===={type(s)}=====")
    month = int(s[4:6])
    day = int(s[6:8])
    result = "-1"
    if 1 <= month and month <= 12 and 1 <= day and day <= md[month - 1]:
        result = s[0:4] + "/" + s[4:6] + "/" + s[6:8]
    print(f"#{test_case} {result}" ) # 띄어쓰기까지 한방에 출력 개 편함.


