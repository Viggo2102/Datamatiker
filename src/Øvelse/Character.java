package Øvelse;

    public class Character {
        private int intelligence;
        private int strength;
        private int charisma;
        private int luck;

        private int level;
        private int experience;
        private int experienceToNextLevel;

        // Constructor
        public Character(int intelligence, int strength, int charisma, int luck) {
            this.intelligence = intelligence;
            this.strength = strength;
            this.charisma = charisma;
            this.luck = luck;

            this.level = 1;
            this.experience = 0;
            this.experienceToNextLevel = 100;
        }

        // Getters and setters for each attribute
        public int getIntelligence() {
            return intelligence;
        }

        public void setIntelligence(int intelligence) {
            this.intelligence = intelligence;
        }

        public int getStrength() {
            return strength;
        }

        public void setStrength(int strength) {
            this.strength = strength;
        }

        public int getCharisma() {
            return charisma;
        }

        public void setCharisma(int charisma) {
            this.charisma = charisma;
        }

        public int getLuck() {
            return luck;
        }

        public void setLuck(int luck) {
            this.luck = luck;
        }

        public int getLevel() {
            return level;
        }

        public int getExperience() {
            return experience;
        }

        // Gain experience method
        public void gainExperience(int expPoints) {
            this.experience += expPoints;

            // Check if the character can level up
            if (experience >= experienceToNextLevel) {
                levelUp();
            }
        }

        // Level up method
        private void levelUp() {
            level++;
            experience -= experienceToNextLevel;
            experienceToNextLevel = (int) (experienceToNextLevel * 1.5); // Example: Increase experience required for next level
            System.out.println("Congratulations! You've reached level " + level);
        }

        // Method to print out the character's attributes
        public void printAttributes() {
            System.out.println("Character Attributes:");
            System.out.println("Intelligence: " + intelligence);
            System.out.println("Strength: " + strength);
            System.out.println("Charisma: " + charisma);
            System.out.println("Luck: " + luck);
        }

        public static void main(String[] args) {
            // Create a character and set its attributes
            Character myCharacter = new Character(8, 7, 6, 9);
            myCharacter.gainExperience(120);
            myCharacter.printAttributes();
            System.out.println("Current Level: " + myCharacter.getLevel());
            System.out.println("Current Experience: " + myCharacter.getExperience());


            // Print out the character's attributes
            myCharacter.printAttributes();
        }
    }
