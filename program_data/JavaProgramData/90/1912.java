package <missing>;

public class GlobalMembers
{
	public static int baifang(int m, int n)
	{
		int i;
		int r;
		if (n == 1)
		{
			return 1;
		}
		if (m == 1)
		{
			return 1;
		}
		if (m < n)
		{
			r = baifang(m, n - 1);
		}
		else
		{
			r = baifang(m, n - 1) + baifang(m - n, n);
		}
		return r;
	}
	public static int Main()
	{
		 int t;
		 int m;
		 int n;
		 int i;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= t;i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",baifang(m, n));
		 }
	}
}

