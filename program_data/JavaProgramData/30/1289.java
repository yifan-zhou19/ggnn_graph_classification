package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int sum = 0;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i; i <= n; i++)
		{
			b = i % 10;
			a = (i - b) / 10;
			if (i % 7 == 0 || a == 7 || b == 7)
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
	}
}

