package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (int i = 1 ; i <= n ; i++)
		{
			if (i % 7 != 0 && i % 10 != 7 && (i % 70 >= 10 || i <= 10))
			{
				sum = sum + i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

