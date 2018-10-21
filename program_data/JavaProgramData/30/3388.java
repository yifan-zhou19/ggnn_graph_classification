package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			System.out.print(0);
		}
		else
		{
			int i = 0;
			for (i = 0; i <= n; i++)
			{
				if (i % 7 != 0 && i % 10 != 7 && i / 10 != 7)
				{
					sum = sum + i * i;
				}

			}
		}
		System.out.printf("%d\n", sum);

	}

}

