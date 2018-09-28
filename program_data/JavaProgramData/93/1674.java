package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int c = 0;
	int[] s = {3, 5, 7};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 3;i++)
	{
		if (n % s[i] == 0)
		{
			c++;
		}
	}

	if (c == 3)
	{
		System.out.print("3 5 7");
	}
	else if (c == 0)
	{
			System.out.print("n");
	}
	else if (c == 1)
	{
			for (i = 0;i < 3;i++)
			{
				if (n % s[i] == 0)
				{
					System.out.printf("%d",s[i]);
				}
			}
	}
	else if (c == 2)
	{
				if (n % 3 != 0)
				{
					System.out.print("5 7");
				}
				if (n % 5 != 0)
				{
					System.out.print("3 7");
				}
				if (n % 7 != 0)
				{
					System.out.print("3 5");
				}
	}


	return 0;
	}
}

