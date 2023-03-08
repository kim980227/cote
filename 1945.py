import sys

sys.stdin = open("input.txt", "r")


def calc(target, length, div=[]):
    cnt = [0, 0, 0, 0, 0]
    for i in range(length):
        while 1:
            if target % div[i] == 0:
                cnt[i] += 1
                target //= div[i]
            else:
                break
    return cnt


t = int(input())

for test_case in range(1, t + 1):
    target = int(input())
    div = [2, 3, 5, 7, 11]
    cnt = calc(target, len(div), div)

    answer = " ".join(map(str, cnt))  # " " << 원소마다 띄어쓰기 한칸씩

    print("#{} {}".format(test_case, answer))
