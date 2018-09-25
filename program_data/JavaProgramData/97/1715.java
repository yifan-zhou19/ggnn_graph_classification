package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int sum;
	   sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		  if (sum >= 100)
		  {
			  System.out.print(sum / 100);
			  System.out.print("\n");
			  sum = sum - 100 * (sum / 100);
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
		  if (sum >= 50)
		  {
			  System.out.print(sum / 50);
			  System.out.print("\n");
			  sum = sum - 50 * (sum / 50);
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
		  if (sum >= 20)
		  {
			 System.out.print(sum / 20);
			 System.out.print("\n");
			 sum = sum - 20 * (sum / 20);
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
		  if (sum >= 10)
		  {
			 System.out.print(sum / 10);
			 System.out.print("\n");
			 sum = sum - 10 * (sum / 10);
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
		  if (sum >= 5)
		  {
			 System.out.print(sum / 5);
			 System.out.print("\n");
			 sum = sum - 5 * (sum / 5);
		  }
		  else
		  {
			  System.out.print(0);
			  System.out.print("\n");
		  }
		  System.out.print(sum);


	   return 0;
	}

}

