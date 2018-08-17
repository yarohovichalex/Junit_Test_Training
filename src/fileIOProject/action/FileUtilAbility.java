package fileIOProject.action;

import java.time.LocalTime;

public class FileUtilAbility {

	public static int timeComparison(LocalTime[][] stringArray) {
		int[] temp = new int[stringArray.length];

		for (int i = 0; i < stringArray.length; i++) {
			int coming = compareOne(stringArray[i][0], stringArray);
			int leaving = compareOne(stringArray[i][1], stringArray);
			temp[i] = coming + leaving;
		}
		int a = getMax(temp);
		return a;

	}

	public static int compareOne(LocalTime localTime, LocalTime[][] stringArray) {
		int counter = 0;

		for (int i = 0; i < stringArray.length; i++) {

			if (stringArray[i][0].compareTo(localTime) == -1 && stringArray[i][1].compareTo(localTime) == 1) {
				counter++;
			}
		}
		return counter;
	}

	public static int getMax(int[] list) {
		int max = 0;
		for (int i = 0; i < list.length; i++)
			if (max < list[i])
				max = list[i];
		return max;
	}
}
