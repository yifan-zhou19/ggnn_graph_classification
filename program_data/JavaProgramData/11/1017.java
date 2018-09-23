package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int y;
	   int m;
	   int d;
	   int i;
	   int number = 0;
	   y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
	  {
		  for (i = 1;i <= m - 1;i++)
		  {
			number = number + b[i - 1];
		  }
		  number = number + d;
	  }
	else
	{
		  for (i = 1;i <= m - 1;i++)
		  {
			number = number + a[i - 1];
		  }
		  number = number + d;
	}
	System.out.print(number);
	System.out.print("\n");
	return 0;
	}
}

