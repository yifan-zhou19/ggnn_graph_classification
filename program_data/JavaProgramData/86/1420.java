package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[21];
		int m;
		int n;
		int j;
		int i;
		int sum;
		int sum1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		sum = sum1 = 0;
		for (i = 1;i <= 20;i++)
		{
			a[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= 20;i++)
		{
			if ((a[i] <= 60 - (i - 1) * 3) && a[i] != 0)
			{
				sum = a[i];
				sum1 = a[i] + 3 * i;
			}
			if (a[i] == 0)
			{
				sum = sum + 60 - sum1;
				sum1 = 60;
			}
			if (sum1 >= 60)
			{
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("60\n");
		}
		else
		{
			System.out.printf("%d\n",sum);
		}
		}
		return 0;
	}
}

