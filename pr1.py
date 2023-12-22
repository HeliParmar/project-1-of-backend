def display_positions(words, target_letter):
    for word in words:
        positions = [i for i, char in enumerate(word) if char == target_letter]
        print(f"Word: {word}, Positions of '{target_letter}': {positions}")

if __name__ == "__main__":
    words = [input(f"Enter word {i+1}: ") for i in range(5)]
    target_letter = input("Enter a letter to find its positions within each word: ")
    display_positions(words, target_letter)
