import java.util.*;

class AnimalException extends Exception {
    public AnimalException(String message) {
        super(message);
    }
}

// 동물 정보 객체
class Animal {
    private String name;
    private String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }

    @Override
    public String toString() {
        return "[" + species + "] " + name;
    }
}

public class AnimalShelter {
    public static void main(String[] args) {
        List<Animal> shelter = new ArrayList<>(); // 보호 중인 동물
        Set<String> speciesSet = new HashSet<>(); // 보호 중인 동물 종류
        Map<String, String> Records = new HashMap<>(); // 입양 기록 (동물이름 -> 입양자명)

        // 동물 추가
        shelter.add(new Animal("두부", "고양이"));
        shelter.add(new Animal("애옹이", "고양이"));
        shelter.add(new Animal("룽지", "강아지"));
        shelter.add(new Animal("뽀리", "강아지"));

        // 동물 종류만 저장
        for (Animal a : shelter) {
            speciesSet.add(a.getSpecies());
        }
        System.out.println("보호소에 있는 동물 종류: " + speciesSet);

        // 강아지 이름만 출력
        System.out.print("현재 보호 중인 강아지: ");
        shelter.stream()
                .filter(a -> a.getSpecies().equals("강아지"))
                .forEach(a -> System.out.print(a.getName() + " "));
        System.out.println("\n");

        // --- 입양 진행 ---
        String targetName = "룽지";
        String adopter = "안지현";



        try {
            boolean isAdopted = false;
            Iterator<Animal> iter = shelter.iterator();

            while (iter.hasNext()) {
                Animal currentAnimal = iter.next();

                // 찾던 동물이면 입양 완료
                if (currentAnimal.getName().equals(targetName)) {
                    iter.remove();
                    Records.put(targetName, adopter);
                    isAdopted = true;
                    System.out.println("🎉 " + targetName + " 입양 완료! (입양자: " + adopter + ")");
                    break;
                }
            }

            // 끝까지 찾았는데 동물이 없었다면 예외 강제 발생
            if (!isAdopted) {
                throw new AnimalException("보호소에 '" + targetName + "'(이)라는 동물이 없습니다.");
            }

        } catch (AnimalException e) {
            System.out.println("입양 실패: " + e.getMessage());
        } finally {
            System.out.println("입양을 완료하였습니다.\n");
        }

        // 최종 결과 확인
        System.out.println("남은 동물 목록: " + shelter);
        System.out.println("성공한 입양 기록: " + Records);
    }
}