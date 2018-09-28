package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 100)
		{
			System.out.print("?????");
			System.out.print("\n");
		}
		for (int i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i / 10 == 7 || i - (i / 10) * 10 == 7)
			{
				continue;
			}
			else
			{
			sum += i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

