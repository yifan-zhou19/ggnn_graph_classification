package <missing>;

public class GlobalMembers
{
	public static void s(int m)
	{
		int i;
		int j;
		int[] c = new int[1000];
		int d;
		for (i = 0;i < m;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
				if (c[j] > c[j + 1])
				{
					d = c[j];
					c[j] = c[j + 1];
					c[j + 1] = d;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d",c[i]);
			if (i != m - 1)
			{
				System.out.print(" ");
			}
		}
	}
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		s(a);
		System.out.print(" ");
		s(b);
	}
}

