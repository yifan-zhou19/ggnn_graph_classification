package <missing>;

public class GlobalMembers
{
	public static int judge1(int m) //???????
	{
		double a = Math.sqrt((double)m);
		int b = ((int)a) + 1;
		int i;
		for (i = 2;i <= b;i++)
		{
			if (m % i == 0)
			{
				break;
			}
		}
		if (i == b + 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int judge2(int m) //????????
	{
		int[] num = new int[20];
		int p;
		int q;
		int i;
		int n;
		for (i = 1;i <= 19;i++)
		{
			num[i] = 11;
		}
		q = m;
		i = 1;
		while (q != 0)
		{
			p = q % 10;
			q = (q - p) / 10;
			num[i] = p;
			i = i + 1;
		}
		for (i = 1;i <= 19;i++)
		{
			if (num[i] == 11)
			{
				break;
			}
		}
		n = i - 1;
		for (i = 1;i <= n;i++)
		{
			if (num[i] != num[n + 1 - i])
			{
				break;
			}
		}
		if (i == n + 1)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int b = 0;
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
			if (judge1(i) == 1 && judge2(i) == 1)
			{
				System.out.printf("%d",i);
				b = 1;
				break;
			}
		}
		if (b == 1)
		{
		i = i + 1;
		while (i <= n)
		{
			if (judge1(i) == 1 && judge2(i) == 1)
			{
				System.out.printf(",%d",i);
			}
			i = i + 1;
		}
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

