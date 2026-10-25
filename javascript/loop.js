for (let i = 1; i <= 5; i++) {
    console.log(i);
}


let n=10;
let i=1;
while(i<=n){
console.log(i);
i++;
}


for (let i = 1; i <= 5; i++) {
    if (i === 3) {
        break;
    }
    console.log(i);
}


let age = 22;
let hasLicense = true;

if (age >= 18) {
    if (hasLicense) {
        console.log("Can drive");
    } else {
        console.log("License required");
    }
} else {
    console.log("Too young");
}