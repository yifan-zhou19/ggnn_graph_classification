package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f1 = int p;
		int f2 = int p;
		int m;
		int n;
		int i;
		int flag = 0;
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
		for (i = m;i <= n;i++)
		{
		if (f1(i) == 1 && f2(i) == 1 && flag == 0)
		{
			flag++;
			System.out.printf("%d",i);
		}
		else if (f1(i) == 1 && f2(i) == 1 && flag != 0)
		{
			System.out.printf(",%d",i);
		}
		}
		if (flag == 0)
		{
			System.out.print("no");
		}
		return 0;
	}

	public static int f1(int p)
	{
		int c;
		int i;
		int k;
		int flag = 0;
		k = Math.sqrt(p);
		for (i = 2;i <= k;i++)
		{
		if (p % i == 0)
		{
			flag++;
		}
		}
		if (flag == 0)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return (c);
	}

	public static int f2(int p)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int k;
		if (p >= 10000)
		{
			a = p / 10000;
			b = (p - a * 10000) / 1000;
			c = (p - a * 10000 - b * 1000) / 100;
			d = (p - a * 10000 - b * 1000 - c * 100) / 10;
			e = p - a * 10000 - b * 1000 - c * 100 - d * 10;
			if (a == e && b == d)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
		}
		else if (p >= 1000 && p < 10000)
		{
			a = p / 1000;
			b = (p - a * 1000) / 100;
			c = (p - a * 1000 - b * 100) / 10;
			d = p - a * 1000 - b * 100 - c * 10;
			if (a == d && b == c)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
		}
		else if (p >= 100 && p < 1000)
		{
			a = p / 100;
			b = (p - a * 100) / 10;
			c = p - a * 100 - b * 10;
			if (a == c)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
		}
		else if (p >= 10 && p < 100)
		{
			a = p / 10;
			b = p - a * 10;
			if (a == b)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
		}
		else
		{
			k = 1;
		}
		return (k);
	}



}

