package game;

public class Character {
    private String name;
    private char specie;
    private int life; 
    private int strength;
    private String role;
    private boolean isZombi;
    
    public Character(String name, char specie, int life, int strength, String role, boolean isZombi) {
        this.name = name;
        this.specie = specie;
        this.life = life;
        this.strength = strength;
        this.role = role;
        this.isZombi = isZombi;
    }

    public void showCharacter () {
        String message = """
        ==================
        Ficha de %s
        ==================        
        Specie: %s
        Role: %s
        Vida: %s
        Fuerza: %s
        ¿Es Zombi?: %s 
        """; 
        System.out.println("");
        System.out.println(message.formatted(name, specie, role, life, strength, isZombi));
    }

}


