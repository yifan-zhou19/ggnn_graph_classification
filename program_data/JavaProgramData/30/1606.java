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
			if (i % 7 == 0)
			{
				continue;
			}
			else if ((i - 7) % 10 == 0)
			{
				continue;
			}
			else if (i > 69 && i < 80)
			{
				continue;
			}
			else
			{
				sum += i * i;
			}
		}
		System.out.print(sum);
	}
}

