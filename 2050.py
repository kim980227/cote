import sys

sys.stdin = open("input.txt", "r")

li=list(map(str,input()))

for i in li:
    print(ord(i)-64, end=" ") # 아스키 코드 출력 ord



# li = list(map(str, input()))
# di = {}
#
# di = {
#     'A': 1,
#     'B': 2,
#     'C': 3,
#     'D': 4,
#     'E': 5,
#     'F': 6,
#     'G': 7,
#     'H': 8,
#     'I': 9,
#     'J': 10,
#     'K': 11,
#     'L': 12,
#     'M': 13,
#     'N': 14,
#     'O': 15,
#     'P': 16,
#     'Q': 17,
#     'R': 18,
#     'S': 19,
#     'T': 20,
#     'U': 21,
#     'V': 22,
#     'W': 23,
#     'X': 24,
#     'Y': 25,
#     'Z': 26,
# }
#
#
# for i in di.values():
#     print(i, end=" ") # endline 설정 defalut는 new line

