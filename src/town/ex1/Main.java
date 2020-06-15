package town.ex1;

public class Main {

	public static void main(String[] args) {
		OrderedList<Town> orderedTownsList = new OrderedList<>();
		
		orderedTownsList.addInOrderedList(new Town("Bucuresti", 100));
		orderedTownsList.addInOrderedList(new Town("Cluj", 400));
		orderedTownsList.addInOrderedList(new Town("Oradea", 600));
		orderedTownsList.addInOrderedList(new Town("Timisoara", 550));
		orderedTownsList.addInOrderedList(new Town ("Calarasi", 0));
		
		System.out.println(orderedTownsList);
	}

}
