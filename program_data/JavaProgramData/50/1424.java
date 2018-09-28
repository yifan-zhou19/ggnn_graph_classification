package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int w;
	int i;
	int[] s = new int[365];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}

	for (i = 1;i < 366;i++)
	{
		s[i] = w + i - 1;

	while (s[i] > 7)
	{
			s[i] = s[i] - 7;
	}

	if (i <= 31)
	{
			if ((i == 13) && (s[i] == 5))
			{
			System.out.print("1\n");
			}
	}

	else if (i - 31 <= 28)
	{
			if ((i - 31 == 13) && (s[i] == 5))
			{
			System.out.print("2\n");
			}
	}

	else if (i - 31 - 28 <= 31)
	{
			if ((i - 31 - 28 == 13) && (s[i] == 5))
			{
			System.out.print("3\n");
			}
	}

	else if (i - 31 - 28 - 31 <= 30)
	{
			if ((i - 31 - 28 - 31 == 13) && (s[i] == 5))
			{
			System.out.print("4\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 <= 31)
	{
			if ((i - 31 - 28 - 31 - 30 == 13) && (s[i] == 5))
			{
			System.out.print("5\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 <= 30)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 == 13) && (s[i] == 5))
			{
			System.out.print("6\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 <= 31)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 == 13) && (s[i] == 5))
			{
			System.out.print("7\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 - 31 <= 31)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 - 31 == 13) && (s[i] == 5))
			{
			System.out.print("8\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 <= 30)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 == 13) && (s[i] == 5))
			{
			System.out.print("9\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 <= 31)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 == 13) && (s[i] == 5))
			{
			System.out.print("10\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 <= 30)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 == 13) && (s[i] == 5))
			{
			System.out.print("11\n");
			}
	}
	else if (i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 <= 31)
	{
			if ((i - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 == 13) && (s[i] == 5))
			{
			System.out.print("12\n");
			}
	}

	}

	return 0;
	}
}

