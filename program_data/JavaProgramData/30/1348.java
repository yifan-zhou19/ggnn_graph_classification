package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			if ((i % 7) == 0)
			{
				continue;
			}
			if ((i % 10) == 7)
			{
				continue;
			}
			if ((i / 10) == 7)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.print(sum);
		return 0;
	}
}

