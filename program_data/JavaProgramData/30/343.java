package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i % 10 == 7 || (i - i % 10) / 10 == 7)
			{
				continue;
			}
			else
			{
				sum = sum + Math.pow((double)i,2.0);
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

