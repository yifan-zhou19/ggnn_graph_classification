package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j = 0;
		int k;
		int h;
		int l = 0;
		int p;
		int q;
		int m = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = a;i <= b;i++)
		{
			k = Math.sqrt(i);
			for (h = 2;h <= k;h++)
			{
				if (i % h == 0)
				{
					break;
				}
			}

			if (h >= k + 1 && i != 1)
			{
				p = i;
				while (p != 0)
				{
					q = p % 10;
					j = j * 10 + q;
					p = p / 10;
				}
				if (i == j)
				{
					System.out.printf("%d",j);
					m = 1;
					n = j;
					break;
				}
				j = 0;
			}
		}
		j = 0;
		for (i = n + 1;i <= b;i++)
		{
			k = Math.sqrt(i);
			for (h = 2;h <= k;h++)
			{
				if (i % h == 0)
				{
					break;
				}
			}

			if (h >= k + 1 && i != 1)
			{
				p = i;
				while (p != 0)
				{
					q = p % 10;
					j = j * 10 + q;
					p = p / 10;
				}
				if (i == j)
				{
					System.out.printf(",%d",j);
					m = 1;
				}
				j = 0;
			}
		}
		if (m == 0)
		{
		System.out.print("no");
		}
	}

}

