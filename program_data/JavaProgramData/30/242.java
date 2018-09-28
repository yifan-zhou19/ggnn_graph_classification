package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 != 0)
			{
				t = (i + 3) % 10;
				if (t != 0)
				{
					if (i > 79)
					{
						sum = sum + i * i;
					}
					if (i < 70)
					{
						sum = sum + i * i;
					}
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

