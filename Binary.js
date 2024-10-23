function binary(){
    console.log("hello")

let s=0;
let flag=0;
let a=[10,15,18,32,88];
let e=a.length-1;
let search=parseInt(prompt("Enter a no: "))
for(i=0;i<a.length;i++){
    let m=parseInt((s+e)/2);
    if(search==a[m]){
        flag=1;
        break;
    }
    else if(search>a[m]){
        s=m+1;
    }
    else{
        e=m-1;
    }
}
if(flag==1){
    alert("found");
}
else{
    alert("not found");
}
}
console.log(binary());
