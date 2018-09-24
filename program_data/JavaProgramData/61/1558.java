package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int[] a = new int[1000];
		a[0] = 0;
		a[1] = 1;
		int i;
		for (i = 2;i <= n;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
		}
		if (i == 1)
		{
			return 1;
		}
		else
		{
			return a[n];
		}
	}
	public static int Main()
	{
		int n;
		int x;
		int i;
		int[] p = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			p[i] = F(x);
			System.out.printf("%d\n",p[i]);
		}
		return 0;
	}
}

