public class Main {
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.create("Aijan", "Alieva", "Alievna", new Male());
        controller.create("Sezim", "Kerimova", "Kerimovna", new Male());
        controller.create("Nurbek", "Amanturov", "Amanturovich", new Female());
        controller.create("Kalybek", "Ismailov", "Ismailovich", new Female());

        controller.printStudentList();

    //     Student student1 = new Student(5, "Aijan", "Alieva", "Alievna");
    //     Student student2 = new Student(2, "Sezim", "Kerimova", "Kerimovna");
    //     Student student3 = new Student(4, "Nurbek", "Amanturov", "Amanturovich");
    //     Student student4 = new Student(3, "Mirbek", "Ulanbekov", "Ulanbekovich");
    //     Student student5 = new Student(1, "Gulya", "Omorova", "Omorovna");
    //     StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
    //     studentGroup.addStudent(student1);
    //     studentGroup.addStudent(student2);
    //     studentGroup.addStudent(student3);
    //     studentGroup.addStudent(student4);
    //     studentGroup.addStudent(student5);
    //     StudentGroupService service = new StudentGroupService(studentGroup);
    //     printListStudent(service.getSortedStudentGroupByFIO());
    //     // System.out.println(student1.compareTo(student2));
    //     // StudentGroupIterator iterator = new StudentGroupIterator(studentGroup.getStudentList());
    //     // printListStudent(studentGroup);
    // }

    // static void printListStudent(List<Student> students){
    //     // while (iterator.hasNext()) {
    //     //     Student student = iterator.next();
    //     //     System.out.println(student);
    //     // }

    //     for (Student student : students) {
    //         System.out.println(student);
    //     }

    }
}