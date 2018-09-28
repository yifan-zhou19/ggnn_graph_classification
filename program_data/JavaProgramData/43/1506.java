package <missing>;

public class GlobalMembers
{
	public static int zhishu(int n)
	{
		int i;
		int m;
		for (i = 2;i < n;i++)
		{
		   if (n % i == 0)
		   {
				m = 0;
			break;
		   }
		}
		if (i == n)
		{
		 m = 1;
		}
		 return m;
	}
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 3;i <= n / 2;i++)
		{
				a = zhishu(i);
				b = zhishu(n - i);
				if (a == 1 && b == 1)
				{
				 System.out.printf("%d %d\n",i,n - i);
				}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

