package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k = 0;
		int i = 0;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k + 1;i++)
		{
			if (i % 7 != 0)
			{
				if ((i - 7) % 10 != 0)
				{
					if ((i - (i % 10)) / 10 != 7)
					{
						sum = sum + (int)Math.pow(1.0 * i,2.0);
					}
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

