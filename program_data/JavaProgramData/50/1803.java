package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 365;i++)
		{
			if (i % 7 + n == 6 || i % 7 + n == 13)
			{
				if (i == 13)
				{
					System.out.print("1\n");
				}
				if (i == 44)
				{
					System.out.print("2\n");
				}
				if (i == 72)
				{
					System.out.print("3\n");
				}
				if (i == 103)
				{
					System.out.print("4\n");
				}
				if (i == 133)
				{
					System.out.print("5\n");
				}
				if (i == 164)
				{
					System.out.print("6\n");
				}
				if (i == 194)
				{
					System.out.print("7\n");
				}
				if (i == 225)
				{
					System.out.print("8\n");
				}
				if (i == 256)
				{
					System.out.print("9\n");
				}
				if (i == 286)
				{
					System.out.print("10\n");
				}
				if (i == 317)
				{
					System.out.print("11\n");
				}
				if (i == 347)
				{
					System.out.print("12\n");
				}
			}
		}

		return 0;
	}

}

