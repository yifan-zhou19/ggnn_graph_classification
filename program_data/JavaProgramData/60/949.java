package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int e = 0;
		int b = 0;
		int sum = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			e = 0;
			a = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
				e = 1;
				break;
				}
			}
			if (e == 0)
			{
			a = i - sum;
			sum = i;
			}
			if (a == 2)
			{
			b++;
			System.out.printf("%d %d\n",sum - 2,sum);
			}
		}
			if (b == 0)
			{
			System.out.print("empty");
			}
		return 0;
	}
}

