package Essentials;

public enum Material {
        STONE("каменный");

        public final String name;

        Material(String s) {
                this.name = s;
        }

        @Override
        public String toString() {
                return this.name;
        }
}
