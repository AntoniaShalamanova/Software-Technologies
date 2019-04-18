function printLines(lines) {
    let i = 0;

    while (lines[i] !== 'Stop') {
        console.log(lines[i]);
        i++;
    }
}

printLines(['Line 1', 'Line 2', 'Line 3', 'Stop']);