package jp.ac.uryukyu.ie.e185708;

public class LivingThinking {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
    private String rival;

    public LivingThinking(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThinking rival) {
        for (int i = 0; i == 0 && isDead() == false; i++) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, rival.getName(), damage);
            rival.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
        }if(name.equals("勇者")){
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
        System.out.printf("モンスター%sは倒れた。\n", name);
    }

}