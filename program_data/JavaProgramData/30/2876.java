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
			if (i % 7 == 0 || (i >= 70 && i <= 79) || (i % 10 == 7))
			{
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

