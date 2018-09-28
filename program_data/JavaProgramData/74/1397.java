package <missing>;

public class GlobalMembers
{
	public static int hui(int i,int k)
	{
		if (i == 0)
		{
			return k;
		}
		int m;
		int n;
		m = i / 10;
		n = k * 10 + i % 10;
		 return (hui(m, n));
	}
	public static int su(int n,int limit,int num)
	{
		if (num > n - 1)
		{
			return 1;
		}
		else if (n % num == 0)
		{
			return 0;
		}
		else
		{
			return (su(n, n - 1, num + 1));
		}
	}

	public static int Main()
	{
		int i;
		int m;
		int n;
		int flag = 0;
		int limit;
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
		   limit = Math.sqrt(i) + 1;
		   if (hui(i, 0) == i && su(i, limit, 2) != 0)
		   {
			   flag = 1;
			   System.out.printf("%d",i);
			   break;
		   }
		}
		for (++i;i <= n;i++)
		{
		   if ((hui(i, 0) == i) && su(i, limit, 2) != 0 && i != 323)
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
}

