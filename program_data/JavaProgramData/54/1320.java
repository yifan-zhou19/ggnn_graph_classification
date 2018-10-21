package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fun = new int(int s,int n,int k);
		int n;
		int k;
		int i;
		int s;
		int j;
		int judge;
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
		for (i = 1;;i++)
		{
			s = i;
			judge = 1;
			for (j = 1;j <= n;j++)
			{
				s = fun(s, n, k);
				if (s == 0)
				{
					judge = 0;
					break;
				}
			}
			if (judge == 1)
			{
				break;
			}
		}
		System.out.printf("%d",i);
		return 0;
	}
	public static int fun(int s,int n,int k)
	{
		if (s % n != k)
		{
			s = 0;
		}
		else
		{
			s = (s - k) / n * (n - 1);
		}
		return s;
	}
}

