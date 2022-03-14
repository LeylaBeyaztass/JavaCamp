public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor(1,"Engin" , "Demiroğ");
        Instructor instructor2 = new Instructor(2,"Ali" , "Veli");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

        Category category = new Category(1, "Java" , "Yazılım Geliştirme Kampı" , 35);
        CategoryManager categoryManager = new CategoryManager();
        categoryManager.addCategory(category);
        categoryManager.updateCategory(category);
        categoryManager.deleteCategory(category);


    }
}
