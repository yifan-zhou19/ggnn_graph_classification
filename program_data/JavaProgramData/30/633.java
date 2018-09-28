package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int i = 1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			int sum = 0;
	while (i <= n)
	{
		if (i < 70 && (i - 7) % 10 != 0 && i % 7 != 0)
		{
			sum = sum + i * i;
			i++;
		}
		else if (i >= 80 && (i - 7) % 10 != 0 && i % 7 != 0)
		{
			sum = sum + i * i;
			i++;
		}
		else
		{
			sum = sum + 0;
			i++;
		}
	}
		System.out.printf("%d",sum);
	return 0;
	}
}

