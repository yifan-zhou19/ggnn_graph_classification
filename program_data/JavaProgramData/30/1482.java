package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i += 1)
		{
			x = i / 10;
		  if (i % 7 == 0 || i % 10 == 7)
		  {
			 sum = sum;
		  }
			else if (x == 7)
			{
			   sum = sum;
			}
			else
			{
				sum += i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

