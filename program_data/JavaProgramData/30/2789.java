package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n; i++)
		{
			a = i / 10;
			b = i - a * 10;
			if ((i <= 10 && i % 7 != 0) || (i % 10 == 0 && i % 7 != 0))
			{
				sum += i * i;
			}
			else if (i % 7 != 0 && b % 7 != 0 && a % 7 != 0)
			{
				sum += i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

