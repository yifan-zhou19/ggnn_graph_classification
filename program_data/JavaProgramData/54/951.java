package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int judge = new int(int,int,int,int);
		int i;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		if (n == 1)
		{
			System.out.printf("%d",k + 1);
		}
		else
		{
			for (i = n + k;;i++)
			{
				if (judge(n, i, n, k) == 1)
				{
					continue;
				}
				System.out.printf("%d",i);
				break;
			}
		}
	}
	public static int judge(int c,int d,int a,int b)
	{
		int f;
		if (d == 0)
		{
			f = 1;
		}
		else if (c == 0)
		{
			f = 2;
		}
		else if ((d - b) % a != 0)
		{
			f = 1;
		}
		else if (judge(c - 1, (d - b) * (a - 1) / a, a, b) == 1)
		{
			f = 1;
		}
		else
		{
			f = 2;
		}
		return (f);
	}
}

