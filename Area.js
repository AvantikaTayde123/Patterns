function areaofcircle(){
    let pi=3.14;
    let r=parseInt(prompt("Enter the radius of circle: "))
    let area=pi*r*r;
    console.log(area);
}
areaofcircle();

function areaoftriangle(){
    let l=parseInt(prompt("Enter the length of triangle: "))
    let b=parseInt(prompt("Enter the bridth of triangle: "))
    let a=1/2*(l*b);
    console.log(a);
}
areaoftriangle();