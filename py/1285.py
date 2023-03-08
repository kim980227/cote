import sys

sys.stdin = open("input.txt", "r")

t = int(input())
for test_case in range(1, t + 1):
    human = int(input())

    locations = list(map(int, input().split()))

    distance = 0
    how_many = 0
    distances = []

    for i in locations:
        if i < 0:
            i *= -1
            distances.append(i)
        else:
            distances.append(i)

    min1 = distances[0]

    for i in distances:
        if min1 > i:
            min1 = i
    distance = min1
    how_many = distances.count(min1)

    print(f"#{test_case} {distance} {how_many}")
