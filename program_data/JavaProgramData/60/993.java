package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int count;
		int x;
		int sum;
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n - 2;i++)
		{
			for (x = 2,count = 0;x < i;x++)
			{
				if (i % x != 0)
				{
					count++;
				}
			}
			if (count == i - 2)
			{
		for (x = 2,count = 0;x < (i + 2);x++)
		{
				if ((i + 2) % x != 0)
				{
					count++;
				}
		}
		if (count == i)
		{
		System.out.printf("%d %d\n",i,i + 2);
		sum++;
		}
			}
		}
		if (sum == 0)
		{
		System.out.print("empty");
		}
	}

}

