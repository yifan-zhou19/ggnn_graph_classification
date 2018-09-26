package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int sum = 0;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i < 10)
			{
				if (i != 7)
				{
				sum = sum + i * i;
				}
			}
			else
			{
				b = i / 10;
				if (i % 10 != 7 && i % 7 != 0 && b != 7)
				{
					sum = sum + i * i;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

