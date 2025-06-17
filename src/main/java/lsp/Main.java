package lsp;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        ((Walkable) dog).walk();

        fish.makeSound();
        // No se intenta caminar con fish, cumpliendo el LSP
    }
}