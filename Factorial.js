function factorial(n){
    if(n==0||n==1){
        return 1;
    }
    return n*factorial(n-1);
}
let no = prompt("Enter the number")
let res=factorial(no)
console.log(`Factorial of ${no} is: ${res}`);
