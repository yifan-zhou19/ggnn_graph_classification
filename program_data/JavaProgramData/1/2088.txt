package <missing>;

public class GlobalMembers
{
	public static int f(int num,int i)
	{
		int sum;
		sum = 0;
		int j;
			for (j = i;j <= num / 2;j++)
			{
				if (num % j == 0)
				{
					if (num / j < j)
					{
						sum = sum;
					}
					else
					{
						sum = 1 + sum + f(num / j, j);
					}
				}
			}
		return sum;
	}
	public static int Main()
	{
		int n;
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			int j;
			int sum;
			sum = 0;
			j = 2;
					sum += f(num, j);
			System.out.printf("%d\n",sum + 1);
		}
		return 0;
	}
}

