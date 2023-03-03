import time

start = time.time()
T= int(input())
for test_case in range(1, T+1):
    li = map(int,input().split())
    sum = 0
    count = 0
    for i in li: # 파이썬 리스트 길이 만큼 이터레이션
        sum += i
        count += 1 # 반복될 때마다 카운트
    print(count)
    avg = sum / count # 파이썬 리스트 길이 구하는 법 몰라서 카운트를 세서 평균을 구함
    n,p = map(int,str(avg).split("."))
    if p >=5:
        n += 1
    print("#" + str(test_case) , str(n))
end=time.time()
print(end-start)