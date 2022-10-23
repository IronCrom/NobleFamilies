import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<NobleFamilies> nobleFamilies2 = new TreeSet<>(new NobleFamiliesComp(2));
        List<NobleFamilies> nobleFamilies = new ArrayList<>();
        nobleFamilies.add(new NobleFamilies("Кристиан Виктор", "Шлезвиг-Гольштейнски", 50));
        nobleFamilies.add(new NobleFamilies("Кристиан Август", "Шлезвиг-Гольштейн-Зондербург-Августенбургский", 55));
        nobleFamilies.add(new NobleFamilies("Александр", "Гессен-Дармштадтский", 45));
        nobleFamilies.add(new NobleFamilies("Константин", "Лёвенштейн-Вертгейм-Розенберг", 37));
        nobleFamilies.add(new NobleFamilies("Мария Франсиска", "Палафокс Портокарреро Киркпатрик", 48));
        nobleFamilies.add(new NobleFamilies("Диего Фернандес", "Кордоба Каррильо деАльборнос", 25));




        Collections.sort(nobleFamilies, new NobleFamiliesComp(3));
        for ( NobleFamilies family : nobleFamilies) {
            System.out.println(family);
        }

        System.out.println();

        nobleFamilies2.addAll(nobleFamilies);
        for ( NobleFamilies family : nobleFamilies2) {
            System.out.println(family);
        }
    }
}
