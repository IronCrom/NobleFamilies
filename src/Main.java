import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Comparator<NobleFamilies> comparator = (NobleFamilies o1, NobleFamilies o2) -> {
            int surnameLength1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int surnameLength2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;

            if (surnameLength1 == surnameLength2 || (surnameLength2 >= 3 && surnameLength1 >= 3)) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return Integer.compare(surnameLength1, surnameLength2);
            }
        };

        Consumer <NobleFamilies> printFamily = family -> System.out.println(family);

        Predicate<NobleFamilies> rmFamily = nobleFamilies1 -> nobleFamilies1.getAge() < 18;

        List<NobleFamilies> nobleFamilies = new ArrayList<>();
        nobleFamilies.add(new NobleFamilies("Кристиан Виктор", "Шлезвиг-Гольштейнски", 50));
        nobleFamilies.add(new NobleFamilies("Кристиан Август", "Шлезвиг-Гольштейн-Зондербург-Августенбургский", 55));
        nobleFamilies.add(new NobleFamilies("Александр", "Гессен-Дармштадтский", 15));
        nobleFamilies.add(new NobleFamilies("Константин", "Лёвенштейн-Вертгейм-Розенберг", 37));
        nobleFamilies.add(new NobleFamilies("Мария Франсиска", "Палафокс Портокарреро Киркпатрик", 48));
        nobleFamilies.add(new NobleFamilies("Диего Фернандес", "Кордоба Каррильо деАльборнос", 17));

        TreeSet<NobleFamilies> nobleFamilies2 = new TreeSet(comparator);

        Collections.sort(nobleFamilies, comparator);
        nobleFamilies.removeIf(rmFamily);
        nobleFamilies.forEach(printFamily);

        System.out.println();

        nobleFamilies2.addAll(nobleFamilies);
        nobleFamilies2.removeIf(rmFamily);
        nobleFamilies2.forEach(printFamily);
    }

}
