#include <stdio.h>
int main(){
        /* Declare variables */
        int num1;
        int num2;
        int num3;
        /*Enter two numbers */
        printf("Please Enter a integer: \n");
        scanf("%d",&num1);
        printf("Please Enter a second integer: \n");
        scanf("%d",&num2);
        printf("Please Enter a third integer: \n");
        scanf("%d",&num3);
        /* Compare them */
        if(num1 > num2 && num2 > num3 ){
            printf("Value in descending order: %d , %d, %d \n",num1,num2,num3);    	
	}
        else if (num2 > num1 && num1 > num3 ){
            printf("Value in descending order: %d , %d, %d \n",num2,num1,num3);    	
	}
	else if(num3 > num2 && num2 > num1 ){
            printf("Value in descending order: %d , %d, %d \n",num3,num2,num1);    	
	}    
	else {
            printf("You entered something weird, exiting:");	
	}
	return 0;
	}
