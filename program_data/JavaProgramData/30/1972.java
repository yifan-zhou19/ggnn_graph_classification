package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i >= 10)
			{
				if ((i % 7 != 0) && (i % 10 != 7) && (((i - i % 10) / 10) % 10 != 7))
				{
				sum = sum + i * i;
				}
			}
			else if (i != 7)
			{
				sum = sum + i * i;
			}
		}
		System.out.printf("%d",sum);
	}


}

