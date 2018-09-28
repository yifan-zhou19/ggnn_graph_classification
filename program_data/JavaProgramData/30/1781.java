package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int t;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else if ((i - 7) % 10 == 0)
			{
				continue;
			}
			else if (i - 70 <= 9 && i - 70 >= 0)
			{
				continue;
			}
			else
			{
				t = i;
			}
			sum += t * t;
		}
		System.out.printf("%d\n",sum);
	}
}

