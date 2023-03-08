import sys
sys.stdin = open("input.txt","r")

from base64 import b64decode
t = int(input())

for test_case in range(1, t+1):
    print(f'#{test_case} {b64decode(input()).decode("UTF-8")}')