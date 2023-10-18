function sortArrayDescending(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                
                const temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

const dynamicArray = [20,9,4,79,12,46,177,100,15,18]; 
sortArrayDescending(dynamicArray);
console.log("Sorted Array in Descending Order:", dynamicArray);
