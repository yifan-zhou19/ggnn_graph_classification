package <missing>;

public class GlobalMembers
{
	public static int with7(int x)
	{
		if (x % 7 == 0)
		{
			return 1;
		}
		while (x > 0)
		{
				  if (x % 10 == 7)
				  {
					  return 1;
				  }
				  x = x / 10;
		}
		return 0;
	}


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = 1;i <= n;i++)
		{
			if (with7(i) == 0)
			{
				sum += (i * i);
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

