package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int flag;
		int k;
		int p;
		int[] a = new int[15];
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			flag = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
					flag = 0;
					break;
				}
			}
			if (flag == 0)
			{
				continue;
			}
			else
			{
			k = 0;
			p = i;
			while (i > 0)
			{
					k = k * 10 + i % 10;
					i = i / 10;
			}
			if (k == p)
			{
				a[q++] = p;
			}
			i = p;
			}

		}
		if (q == 0)
		{
			System.out.print("no\n");
		}
		else
		{
		for (i = 0;i < q - 1;i++)
		{
			System.out.printf("%d,",a[i]);
		}
			System.out.printf("%d\n",a[i]);
		}
	}
}

