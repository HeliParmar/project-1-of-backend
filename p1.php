<?php

function displayPositions($words, $targetLetter) {
    foreach ($words as $word) {
        $positions = [];
        for ($i = 0; $i < strlen($word); $i++) {
            if ($word[$i] === $targetLetter) {
                $positions[] = $i;
            }
        }
        echo "Word: $word, Positions of '$targetLetter': " . implode(' ', $positions) . "\n";
    }
}
$words = [];
for ($i = 0; $i < 5; $i++) {
    echo "Enter word " . ($i + 1) . ": ";
    $words[] = readline();
}

echo "Enter a letter to find its positions within each word: ";
$targetLetter = readline();
displayPositions($words, $targetLetter);
?>
