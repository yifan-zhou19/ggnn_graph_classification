package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sum = sum;
			}
			else if (i / 10 == 7)
			{
				sum = sum;
			}
			else if (i - i / 10 * 10 == 7)
			{
				sum = sum;
			}
			else
			{
				sum = sum + i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

