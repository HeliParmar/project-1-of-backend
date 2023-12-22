function displayPositions(words, targetLetter) {
    for (let word of words) {
        let positions = [];
        for (let i = 0; i < word.length; i++) {
            if (word[i] === targetLetter) {
                positions.push(i);
            }
        }
        console.log(`Word: ${word}, Positions of '${targetLetter}': ${positions.join(' ')}`);
    }
}
const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let words = [];

function takeInput(index) {
    if (index < 5) {
        rl.question(`Enter word ${index + 1}: `, function (word) {
            words.push(word);
            takeInput(index + 1);
        });
    } else {
        rl.question("Enter a letter to find its positions within each word: ", function (targetLetter) {
            // Display positions of the target letter in each word
            displayPositions(words, targetLetter);
            rl.close();
        });
    }
}

takeInput(0);
