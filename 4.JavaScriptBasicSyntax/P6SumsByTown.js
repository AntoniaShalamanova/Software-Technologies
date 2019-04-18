function calcSumByTown(jsonArr) {
    let objects = jsonArr.map(JSON.parse);
    let sumByTowns = {};

    for (let obj of objects) {
        if (obj.town in sumByTowns) {
            sumByTowns[obj.town] += obj.income;
        }
        else{
            sumByTowns[obj.town] = obj.income;
        }
    }

    let towns = Object.keys(sumByTowns).sort();

    for (let town of towns) {
        console.log(`${town} -> ${sumByTowns[town]}`)
    }
}

calcSumByTown(["{\"town\":\"Sofia\",\"income\":200}",
"{\"town\":\"Varna\",\"income\":120}",
"{\"town\":\"Pleven\",\"income\":60}",
"{\"town\":\"Varna\",\"income\":70}"]);