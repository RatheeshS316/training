async function getData(){
    try{
        const response = await fetch("https://jsonplaceholder.typicode.com/users/1");
        if(!response.ok){
            throw new Error(`Error while fetching : ${response.status}`);
        }
        const data = await response.json();
        console.log(data);
    }
    catch(error){
        console.log(`Error while fetching : ${error}`);
    }
}
getData();