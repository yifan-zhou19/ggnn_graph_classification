package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int t;
		int i;
		int k;
		int j;
		int p;
		int q;
		int l;
		int a;
		int b;
		int s;
		b = 0,s = 0;
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
		for (a = m;a <= n;a++)
		{
			t = Math.sqrt(a);
			for (i = 2;i <= t;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i >= t + 1)
			{
				k = a;
				j = 0;
				while (k != 0)
				{
					k = (k - k % 10) / 10;
					j = j + 1;
				}
				p = a;
				q = 0;
				for (l = j;l >= 1;l--)
				{
					q = (p % 10) * Math.pow(10,l - 1) + q;
					p = (p - p % 10) / 10;
				}
				if (a == q)
				{
					b = b + 1;
				}
			}
		}
		for (a = m;a <= n;a++)
		{
			t = Math.sqrt(a);
			for (i = 2;i <= t;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i >= t + 1)
			{
				k = a;
				j = 0;
				while (k != 0)
				{
					k = (k - k % 10) / 10;
					j = j + 1;
				}
				p = a;
				q = 0;
				for (l = j;l >= 1;l--)
				{
					q = (p % 10) * Math.pow(10,l - 1) + q;
					p = (p - p % 10) / 10;
				}
				if (a == q)
				{
					s = s + 1;
					if (s < b)
					{
						System.out.printf("%d,",a);
					}
					else
					{
						System.out.printf("%d",a);
					}
				}
			}
		}
		if (b == 0)
		{
			System.out.print("no");
		}
	}

}

