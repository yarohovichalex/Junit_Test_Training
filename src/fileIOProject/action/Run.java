package fileIOProject.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalTime;
import java.util.ArrayList;

public class Run {
	private static File file = new File(".//dir", "inputtext.txt");
	private static int NUMBER_OF_TIME_IN_ONE_LINE = 2;
	
	public static void main(String[] args) {
		if(file.exists()) {
			ArrayList<String> timeInStringLineList = workingHoursOfAllEmployees();
				int result = FileUtilAbility.timeComparison(fillingTheArrayWithTime(timeInStringLineList));
				System.out.println(result + " result");
				System.out.println("exit");		
		}else {
			System.out.println("file not exist");
		}
	}
	
	private static ArrayList<String> workingHoursOfAllEmployees() {
		BufferedReader br = null;
		ArrayList<String> timeList = new ArrayList<>();
		Reader r;
		try {
			r = new FileReader(file);
			br = new BufferedReader(r);
			String timeWorkOneEmployee;
			while(((timeWorkOneEmployee = br.readLine())!=null)) {
				timeList.add(timeWorkOneEmployee);
			};
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Thread could not close!");
				e.printStackTrace();
			}
		}
		return timeList;
	}
	private static LocalTime[][] fillingTheArrayWithTime(ArrayList<String> timeInStringLineList) {
		String[] timeInOneLine = new String[NUMBER_OF_TIME_IN_ONE_LINE];
		LocalTime[][] localTimeArray = new LocalTime[timeInStringLineList.size()][timeInOneLine.length];
		int i = 0;
		for(String stringLine : timeInStringLineList) {
			timeInOneLine = stringLine.split(" ", timeInOneLine.length);
			for(; i < timeInStringLineList.size(); ) {
				for(int j = 0; j < timeInOneLine.length; j++) {
					localTimeArray[i][j] = LocalTime.parse(timeInOneLine[j]); 
				}
				i++;
				break;
			}
		}
		return localTimeArray;
	}
	
}
