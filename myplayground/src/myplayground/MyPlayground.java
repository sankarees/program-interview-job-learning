package myplayground;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyPlayground {

	public static void main(String[] args) {
		int platformRequired = 0;
/*		int arr[] = { 900};
		int dep[] = { 910};
*/		

		List<Integer> numbers = Arrays.asList(200, 300, 100, 400, 600, 800, 500, 1000, 900);
		
		numbers.stream().collect(Collectors.minBy(Comparator<T>));
		System.out.println("Second largest number "+numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
		Function<String, String> stringManipulation = input -> input+input;
		Function<String, Integer> findCount = input -> input.length();
		Function<String, String> strManipulation = input -> input.replace("str", "Star");
		System.out.println(stringManipulation.apply("mystr"));
		System.out.println(stringManipulation.andThen(strManipulation).apply("mystr"));
		System.out.println(stringManipulation.andThen(strManipulation).andThen(findCount).apply("mystr"));
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length-1 || dep[i] > arr[i + 1])
				platformRequired++;
		}
		System.out.println("platformRequired "+platformRequired);
	}
	
	/*
	
	Message List
	8:orgid:01f870f6-dac5-4160-b2fd-778f87d8a9ff was invited to the meeting.
	Sankareeswaran Alagarsamy has temporarily joined the chat.
	Profile picture of Bansika Kumari.weakhashmap by Bansika Kumari
	Bansika Kumari
	15:02
	weakhashmap

	Given arrival and departure times of all tr... by Bansika Kumari
	Bansika Kumari15:06
	Given arrival and departure times of all trains that reach a railway station, the task is to find the minimum number of platforms required for the railway station so that no train waits.
	We are given two arrays which represent arrival and departure times of trains that stop.
	Input: arr[] = {9:00, 9:40, 9:50, 11:00, 15:00, 18:00}
	dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
	Output: 3



	Input: arr[] = {9:00, 9:40}
	dep[] = {9:10, 12:00}
	Output: 1

	public static void main(String[] args) ... by Bansika Kumari
	Bansika Kumari15:07

	public static void main(String[] args)
	{
	int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
	int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	}

	Profile picture of Bansika Kumari.public static int minPlatform(int arr[], in... by Bansika Kumari

	Bansika Kumari
	15:26
	public static int minPlatform(int arr[], int dep[],
	int n)
	{
	int p = 1, r = 1;
	int i = 1, j = 0;
	for (i = 0; i < n; i++) {
	p = 1;
	for (j = i + 1; j < n; j++) {
	if ((arr[i] >= arr[j] && arr[i] <= dep[j])
	|| (arr[j] >= arr[i]
	&& arr[j] <= dep[i]))
	p++;
	}
	r = Math.max(r, p);
	}
	return r;
	}
	public static void main(String[] args)
	{
	int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
	int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	int n = 6;
	System.out.println(
	"Min No of Platforms Required = "
	+ minPlatform(arr, dep, n));
	}

	Meeting ended:
	15:30 Meeting ended: 36m 46s
	8:orgid:01f870f6-dac5-4160-b2fd-778f87d8a9ff left the chat.
	Sankareeswaran Alagarsamy no longer has access to the chat.

	*/
}
