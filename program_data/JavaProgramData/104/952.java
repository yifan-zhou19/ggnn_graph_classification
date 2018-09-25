package <missing>;

public class GlobalMembers
{
	public static int step(int a,int b)
	{
		int i;
		int n;
		if (a == b)
		{
			return a;
		}
		else
		{
			for (i = 1;Math.pow(2,i) - 1 < b;i++)
			{
			}
			n = i;
			b = Math.pow(2,n - 2) + Math.floor((b - Math.pow(2,n - 1)) / 2);
			if (a <= b)
			{
				step(a, b);
			}
			else
			{
				step(b, a);
			}
		}
	}

	public static int Main()
	{
		int x1;
		int x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x2 = Integer.parseInt(tempVar2);
		}
		if (x1 <= x2)
		{
			System.out.printf("%d\n",step(x1, x2));
		}
		else
		{
			System.out.printf("%d\n",step(x2, x1));
		}
		return 0;
	}

}

