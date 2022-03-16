
def findPairs(pairs):
    s = set()
    for (x, y) in pairs:
        s.add((x, y))
        if (y, x) in s:
            print((x, y))
pairs = [(2, 3), (8, 2), (8,3), (9, 11), (3, 2), (3, 8)]
findPairs(pairs)


