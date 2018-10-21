package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n / 2;i++)
		{
			flag = 0;
			for (j = 2;j < i;j++)
			{
			if (i % j == 0)
			{
			flag = 1;
			}
			}
		if (flag == 0)
		{
			a = i;
		b = n - a;
		for (k = 2;k < b;k++)
		{
			if (b % k == 0)
			{
				flag = 1;
			}
		}
		}
		if (flag == 0)
		{
			System.out.printf("%d %d\n",a,b);
		}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

