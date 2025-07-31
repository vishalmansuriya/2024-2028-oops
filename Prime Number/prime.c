#include<stdio.h>

int main(){

    int number;
    printf("Enter number: ");
    scanf("%d",&number);

    if (number>1){
        for(int i=2;i<=number/2;i++){
            if (number%i==0){
                printf("not prime");
                return 0; //Exit early is not prime
            }
        }
        printf("prime"); //if Loop completed without finding any factor
    }
    else{
        printf("enter number greater than 1");
    }
    
    return 0;
}