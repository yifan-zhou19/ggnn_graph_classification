package <missing>;

public class GlobalMembers
{
	public static int su(int m)
	{
		int p;
		int i;
		if (m == 2)
		{
			p = 1;
		}
		else if (m == 1)
		{
			p = 0;
		}
		else
		{
			for (i = 2;i < m;i++)
			{
				if (m % i == 0)
				{
					p = 0;
					break;
				}
			}
			if (i == m)
			{
				p = 1;
			}
		}
		return (p);
	}
	public static int hui(int m)
	{
		int i = m;
		int j = 0;
		int p;
		while (m > 0)
		{
			j = j * 10 + m % 10;
			m /= 10;
		}
		if (i == j)
		{
			p = 1;
		}
		else
		{
			p = 0;
		}
		return (p);
	}
	public static int Main()
	{
		int m;
		int n;
		int count = 0;
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
		while (m <= n)
		{
			if (su(m) != 0 && hui(m) != 0) //????1????????
			{
				if (count == 0)
				{
					System.out.printf("%d",m);
					count = 1;
				}
				else
				{
					System.out.printf(",%d",m);
				}
			}
			m++;

		}
		if (count == 0)
		{
			System.out.print("no");
		}
		return 0;
	}



}

