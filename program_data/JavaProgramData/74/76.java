package <missing>;

public class GlobalMembers
{
	public static int re(int a)
	{
		int b = 0;
		while (a != 0)
		{
			b = b * 10 + a % 10;
			a = a / 10;
		}
		return (b);
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int j;
		int p = 0;
		int q;
		int[] a = new int[300];
		int re = int a;
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
		i = m;
		k = 0;
		for (i = m;i <= n;i++)
		{
			if (re(i) == i)
			{
				p = i;
				for (j = 2;j <= Math.sqrt(i);j++)
				{
					if (i % j == 0)
					{
						break;
					}
					if (j > Math.sqrt(i) - 1)
					{
						a[k] = i;
						k++;
					}
				}
			}
		}
		if (a[0] != 0)
		{
			System.out.printf("%d",a[0]);
			for (i = 1;i < k;i++)
			{
			System.out.printf(",%d",a[i]);
			}
		}
		if (a[0] == 0)
		{
			System.out.print("no");
		}
	}
}

