



def hcf(a, b):
    if b == 0:
        return a
    else:
        return hcf(b, a % b)
        
def lcm(a, b):
    return (a * b) // hcf(a, b)
first = int(input())
second = int(input())
print("Lcm of", first, "and", second, "is", lcm(first, second))
