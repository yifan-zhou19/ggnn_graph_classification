package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[] z = new int[30000];
		int[] c = new int[30000];
		int[] x = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 10;a <= 100;a++)
		{
			x[a] = 1;
		}
		for (a = 1;a <= n;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				z[a] = Integer.parseInt(tempVar2);
			}
		}
		b = 1;
		for (a = 1;a <= n;a++)
		{
			if (x[z[a]] == 1)
			{
				c[b] = z[a];
				b += 1;
				x[z[a]] = 0;
			}
		}
		for (a = 1;a <= b - 1;a++)
		{
			if (a < b - 1)
			{
				System.out.printf("%d ",c[a]);
			}
			else
			{
				System.out.printf("%d",c[a]);
			}
		}
		return 0;
	}
}

