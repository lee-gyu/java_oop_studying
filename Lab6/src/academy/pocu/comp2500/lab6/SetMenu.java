package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class SetMenu extends Menu {

    private int maxDessertCount;
    private int maxAppetizerCount;
    private int maxMainCourseCount;

    private ArrayList<Appetizer> appetizers = new ArrayList<>();
    private ArrayList<Dessert> desserts = new ArrayList<>();
    private ArrayList<MainCourse> mainCourses = new ArrayList<>();

    protected SetMenu(int price, int maxDessertCount, int maxAppetizerCount, int maxMainCourseCount) {
        super(price);

        this.maxMainCourseCount = maxMainCourseCount;
        this.maxAppetizerCount = maxAppetizerCount;
        this.maxDessertCount = maxDessertCount;
    }

    protected void updateValid() {
        this.isValid = this.maxDessertCount == this.desserts.size() &&
                this.maxAppetizerCount == this.appetizers.size() &&
                this.maxMainCourseCount == this.mainCourses.size();
    }

    protected void setDessertParams(Dessert... desserts) {
        this.desserts.clear();

        for (Dessert d : desserts) {
            this.desserts.add(d);
        }

        updateValid();
    }

    protected void setAppetizerParams(Appetizer... appetizers) {
        this.appetizers.clear();

        for (Appetizer a : appetizers) {
            this.appetizers.add(a);
        }

        updateValid();
    }

    protected void setMainCourseParams(MainCourse... mainCourses) {
        this.mainCourses.clear();

        for (MainCourse m : mainCourses) {
            this.mainCourses.add(m);
        }

        updateValid();
    }

    public ArrayList<Appetizer> getAppetizers() {
        return this.appetizers;
    }

    public ArrayList<Dessert> getDesserts() {
        return this.desserts;
    }

    public ArrayList<MainCourse> getMainCourses() {
        return this.mainCourses;
    }

}
