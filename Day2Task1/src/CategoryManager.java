public class CategoryManager {

    public void addCategory(Category category) {
        System.out.println(category.name +  " " +category.description +" " + category.unitPrice + " TL" + "  Sepetinize eklendi");
    }
    public void deleteCategory(Category category) {
        System.out.println(category.name +  " " +category.description +" " + category.unitPrice + " TL" + "  Sepetinizden çıkarıldı");
    }
    public void updateCategory(Category category) {
        System.out.println(category.name +  " " +category.description +" " + category.unitPrice + " TL" + "  Sepetiniz güncellendi");
    }


}
