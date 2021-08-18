
public class BuildPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		System.out.println();
		System.out.println("NonVeg Meal");
		nonvegMeal.showItems();
		System.out.println("Total Cost: " + nonvegMeal.getCost());

	}
	

}
