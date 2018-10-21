package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		int sum = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		for (i = 1;i <= n;i++)
		{
			a1 = i % 10;
			a2 = i % 7;
			a3 = (i - a1) / 10;
			if (a1 != 7 && a2 != 0 && a3 != 7)
			{
				sum = sum + i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}
}

