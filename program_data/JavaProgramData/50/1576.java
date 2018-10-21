package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int days = 12;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1 ; i <= 12 ; i++)
		{
			if (i == 1)
			{
				days += 0;
			}
			else if (i == 3)
			{
				days += 28;
			}
			else if (i == 5 || i == 7 || i == 10 || i == 12)
			{
				days += 30;
			}
			else
			{
				days += 31;
			}

			if ((days + w - 5) % 7 == 0)
			{
				System.out.printf("%d\n", i);
			}
		}

		return 0;
	}
}

