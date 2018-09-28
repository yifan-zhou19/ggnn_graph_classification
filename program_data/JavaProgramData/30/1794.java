package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int sum;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			sum = 0;
		for (i = 1;i < n + 1;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else if (i % 10 == 7)
			{
				continue;
			}
			else if (i / 10 == 7)
			{
				continue;
			}
			else
			{
				sum = sum + i * i;
			}
		}



		System.out.printf("%d",sum);
	}
}

