package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int c;
		if (x == 1 || x == 2)
		{
			c = 1;
		}
		if (x > 2)
		{
			c = (f(x - 1) + f(x - 2));
		}
		return c;
	}
	public static void Main()
	{
		int[] a = new int[999];
		int n;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f(a[i]));
		}
	}



}

