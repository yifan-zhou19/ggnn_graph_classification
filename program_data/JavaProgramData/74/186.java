package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double m;
		double n;
		double a;
		double b;
		double c;
		double d;
		double e;
		int p;
		int q;
		int t;
		int[] mark = new int[65500];
		int su;
		int sunum;
		int i;
		int num;
		int num1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Double.parseDouble(tempVar2);
		}
		p = Math.log10(m);
		q = Math.log10(n);
		for (i = 0;i < 65500;i++)
		{
			mark[i] = 0;
		}
		for (i = m;i <= n;i++)
		{
			a = Math.floor(i / 10000);
			b = Math.floor((i - a * 10000) / 1000);
			c = Math.floor((i - a * 10000 - b * 1000) / 100);
			d = Math.floor((i - a * 10000 - b * 1000 - c * 100) / 10);
			e = Math.floor(i - a * 10000 - b * 1000 - c * 100 - d * 10);
			t = Math.log10(i);
			switch (t)
			{
			case 0:
				mark[i]++;
				break;
			case 1:
				if (e == d)
				{
					mark[i]++;
				}
				break;
			case 2:
				if (c == e)
				{
					mark[i]++;
				}
				break;
			case 3:
				if ((b == e) && (c == d))
				{
					mark[i]++;
				}
				break;
			case 4:
				if ((a == e) && (b == d))
				{
					mark[i]++;
				}
				break;
			}
			sunum = 0;
			for (su = 2;su < i;su++)
			{
				if (i % su == 0)
				{
					sunum++;
				}
			}
			if (sunum == 0)
			{
				mark[i]++;
			}
			if (i == 0)
			{
				mark[i] = 0;
			}
			if ((i == 1) || (i == 2))
			{
				mark[i] = 2;
			}
		}
		num = 0;
		num1 = 0;
		for (i = m;i <= n;i++)
		{
			if (mark[i] == 2)
			{
				num++;
			}
		}
		if (num == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = m;i <= n;i++)
			{
			if (mark[i] == 2)
			{
			num1++;
			if (num1 < num)
			{
				System.out.printf("%d,",i);
			}
			else
			{
				System.out.printf("%d",i);
			}
			}
			}
		}
	}


}

