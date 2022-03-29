


def hcf(a, b):
    if b == 0:
        return a
    else:
        return hcf(b, a % b)
first = int(input())
second = int(input())
print('HCF of', first, 'and', second, 'is', hcf(first, second))
