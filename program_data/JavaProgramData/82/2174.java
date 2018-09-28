package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int normal = new int(int x,int y);
		int n;
		int i;
		int c = 0;
		int t = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
			if (normal(a[i], b[i]) == 1)
			{
			t += 1;
				if (t > c)
				{
				c = t;
				}
			}
			if (normal(a[i], b[i]) == 0)
			{
				t = 0;
			}
		}
		System.out.printf("%d\n",c);
		return 0;
	}
	public static int normal(int x,int y)
	{
		int z;
		if (x >= 90 && x <= 140 && y >= 60 && y <= 90)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}
}

