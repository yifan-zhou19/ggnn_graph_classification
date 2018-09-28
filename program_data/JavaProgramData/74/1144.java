package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int re;
		int num;
		int p;
		int[] b = new int[500];
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
		k = 0;
		for (i = m;i <= n;i++)
		{
			num = i;
			re = 0;
			while (i > 0)
			{
				p = i % 10;
				re = re * 10 + p;
				i = i / 10;
			}
			i = num;
			if (re == num)
			{
				for (j = 2;j <= Math.sqrt(num);j++)
				{
					if (num % j == 0)
					{
						break;
					}
				}
				if (j > Math.sqrt(num))
				{
					b[k] = num;
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d\n",b[k - 1]);
		}
	}
}

