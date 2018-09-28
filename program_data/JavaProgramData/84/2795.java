package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int number;
	 int largest;
	 int second;
	 int counter;
	 int n;
	 counter = 1;

	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 largest = -10000000;
	 second = largest;
	 while (counter <= n)
	 {

	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  number = Integer.parseInt(tempVar2);
	  }

	  if (number >= largest)
	  {
		  second = largest;
		  largest = number;
	  }
	  else if (second < number && number < largest)
	  {
	   second = number;
	  }
	  else if (number <= second)
	  {
		  second = second;
	  }

	  counter++;
	 }
	 System.out.printf("%d\n", largest);
	 System.out.printf("%d\n", second);
	}
}

