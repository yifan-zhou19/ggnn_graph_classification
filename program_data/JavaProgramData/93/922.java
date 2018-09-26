package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if ((i % 3) == 0)
		{
			System.out.print("3");
			j++;
		}
		if ((i % 5) == 0)
		{
			if (j != 0)
			{
				System.out.print(" ");
			}
			System.out.print("5");
			j++;
		}
		if ((i % 7) == 0)
		{
			if (j != 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
			j++;
		}
		if (j == 0)
		{
		System.out.print("n");
		}
	}
}

