# 5x5 크기의 숫자판이 있다. 각 칸에는 0부터 9까지의 숫자가 적혀있음
# 임의의 위치에서 시작해서, 상하좌우 원하는 곳으로 5번 이동하면 6자리의 수가 됨
# 숫자판이 주어졌을 때, 만들 수 있는 서로 다른 여섯 자리의 수들의 개수를 구하는 프로그램 만들기

# 2중 for문으로 5x5 숫자판 만들기
# 행을 i, 열을 j로 두고 임의의 행을 i+n(n은 1부터 5까지), 임의의 열을 j+m(m은 1부터 5까지)
# 위의 조건으로 임의의 지점을 타겟 할 수 있을 것 같음
# 그 후 while문을 이용해서 숫자 이동이 5번 이루어질 때까지 진행
# 숫자 이동 연산이 끝날 때마다 count 변수에 +1
# 모든 경로 탐색 하기(얘 어케 해야됨?)  