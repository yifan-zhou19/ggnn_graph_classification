package <missing>;

public class GlobalMembers
{
	public static int xx(int m,int n)
	{
		int x = 0;
		if (m < 0)
		{
			x = 0;
		}
		else if (n == 1 || m == 0)
		{
			x += 1;
		}
		else
		{
		x += xx(m, n - 1) + xx(m - n, n);
		}
		return (x);
	}
	public static void Main()
	{
		int n;
		int i;
		int a;
		int b;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",xx(a, b));
		}
	}
}

