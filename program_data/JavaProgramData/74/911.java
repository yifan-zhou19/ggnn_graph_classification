package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int i;
		int j;
		int b;
		int c;
		int d;
		int l = 0;
		int k;
		int e = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (a = m;a <= n;a++)
		{
			for (i = 2;i < a;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i >= a)
			{
				b = a;
				j = 0;
				while (b != 0)
				{
					b = b / 10;
					j++;
				}
				c = a;
				d = 0;
				for (k = j;k >= 1;k--)
				{
					d = d + c % 10 * Math.pow(10,k - 1);
					c = c / 10;
				}
				if (d == a)
				{
				l++;
				}
			}

		}
		if (l == 0)
		{
					System.out.print("no\n");
		}
		else
		{
			for (a = m;a <= n;a++)
			{
			for (i = 2;i < a;i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i >= a)
			{
				b = a;
				j = 0;
				while (b != 0)
				{
					b = b / 10;
					j++;
				}
				c = a;
				d = 0;
				for (k = j;k >= 1;k--)
				{
					d = d + c % 10 * Math.pow(10,k - 1);
					c = c / 10;
				}
				if (d == a)
				{
					if (e < l)
					{
					System.out.printf("%d,",a);
					e++;
					}
				else
				{
					System.out.printf("%d",a);
				}
				}
			}
			}
		}
	}

}

