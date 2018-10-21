package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[ke];
		int[] b = new int[ke];
		int[] c = new int[ke];
		int d;
		int i;
		int j;
		int s;
		int n;
		int L;
		int M;
		int x;
		int y;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < ke;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 0;
			}
		}
		for (i = 1;i < n;i++)
		{
				if (a[i] < a[0])
				{
					a[0] = a[i];
				}
				if (b[i] > b[0])
				{
					b[0] = b[i];
				}
		}
		L = b[0] - a[0] + 1;
		M = 0;
		for (i = 0;i < b[0];i++)
		{
			M = c[i] + M;
		}
		if ((M + L) == (b[0] + 1))
		{
			System.out.printf("%d %d",a[0],b[0]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

