number=int(input("Enter a number: "))
if number > 1:
    for i in range(2,int(number*0.5)+1):
        if number%i==0:
            print("not prime")
            break
    else:
        print("prime")
else:
    print("enter number greater than 1")