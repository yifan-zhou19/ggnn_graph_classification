package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			if (i < 7)
			{
				sum += i * i;
			}
			else
			{
				if (i >= 7 && i % 7 == 0 || i > 10 && (i - 7) % 10 == 0 || i > 70 && (i % 70) <= 9)
				{

				}
				else
				{
					sum += i * i;
				}
			}
		}
		System.out.printf("%d\n", sum);
		return 0;
	}





}

