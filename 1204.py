import sys
sys.stdin =open("input.txt","r")

t = int(input())

for test_case in range(t):
    case = int(input())
    result = []
    max1=0
    answer=0
    scores=list(map(int,input().split())) # 학생의 성적이 담긴 리스트
    for i in range(0,101):
        result.append(scores.count(i)) # 0 ~ 100점 순으로 몇개씩 있는지
    for i in range(0,101):
        if result[i] >= max1:
            max1=result[i]
            answer = i
    print(f"#{case} {answer}")