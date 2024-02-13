import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class Lesson_9_2 {
    private enum Gender {
        MAN,
        WOMAN
    }
   private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" + "name='" + name + '\'' + ", age=" + age + ", gender=" + gender + '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    gender == student.gender;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }


    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        // 1. Средний возраст студентов мужского пола
        double averageAge = students.stream()
                .filter(student -> student.getGender() == Gender.MAN)
                .mapToInt(Student::getAge)
                .average()
                .orElse(0.0);
        System.out.println("Средний возраст студентов мужского пола: " + averageAge);

        // 2. Кому из студентов грозит получение повестки в этом году
        int currentYear = 2024;
        Collection<Student> draftCandidates = students.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 27)
                .collect(Collectors.toList());
        System.out.println("Студенты, которым грозит получение повестки в " + currentYear + " году:");
        draftCandidates.forEach(System.out::println);
    }
}
