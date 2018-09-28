package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 1;
		int sum = 0;
	while (i <= n)
	{
		if (i % 7 == 0)
		{
		i++;
		}
		else
		{
			if (i % 10 == 7)
			{
				 i++;
			}
			else
			{
				if (i - 70 > 0 & i - 70 < 10)
				{
					i++;
				}
				else
				{
					sum = sum + i * i;
					i++;
				}
			}
		}
	}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}
}

