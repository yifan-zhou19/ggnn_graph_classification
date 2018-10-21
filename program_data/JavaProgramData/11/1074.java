package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int m;
		int d;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int counter = 0;
		for (int i = 0 ; i < m - 1; i++)
		{
			if (i == 1 && (n % 4 == 0 && (n % 100 != 0) || n % 400 == 0))
			{
					counter++;
			}
			counter = counter + month[i];
		}

	counter = counter + d;
	System.out.print(counter);
	}
}

