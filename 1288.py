import sys
sys.stdin = open("input.txt", "r")

t = int(input())

for test_case in range(1, t+1):
    n = int(input())
    k = 1
    target = [str(i) for i in range(10)]

    while target: # 타겟만큼 반복xxxx (1 이상의 값이면 true, 0이면 false)
        kn = k * n
        kn = str(kn)
        k += 1
        # print(target)
        for c in kn:
            if c in target:
                target.remove(c) # 타겟이 0이되게(반복문을 종료하도록)

    print(f"{test_case} {kn}")
