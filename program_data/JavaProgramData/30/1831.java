package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			 for (i = 0;i <= n;i++)
			 {
				  sum = sum + i * i;
			 }
		for (i = 0;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sum = sum - i * i;
			}


			else if (i % 10 == 7)
			{
				sum = sum - i * i;
			}


			else if ((i - (i % 10)) == 70)
			{
				sum = sum - i * i;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

