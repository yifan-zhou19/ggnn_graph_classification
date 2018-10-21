package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = 1;i <= n;i++)
		{
			if (i % 10 == 7 || i > 69 && i < 80 || i % 7 == 0)
			{
				continue;
			}
			else
			{
				sum += i * i;
			}
		}
		System.out.printf("%d\n",sum);
		return 0;
	}
}

