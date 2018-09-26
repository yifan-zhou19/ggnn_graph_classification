package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x = 0;
		int y;
		int i;
		int z;
		int m;
		int n;
		int a;
		int b = 0;
		while (b == 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		int[] c = new int[n];
		for (i = 1;i <= n;i++)
		{
		c[i] = i;
		}
		if (n == 0)
		{
		b = 1;
		}
		else
		{
			x = 0;
			while (n >= 2)
			{
			a = m + x;
		x = a % n;
		if (x == 0)
		{
		x = n;
		}
		for (z = x;z < n;z++)
		{
		c[z] = c[z + 1];
		}
		n = n - 1;
		x--;
			}
		System.out.printf("%d\n",c[1]);
		}
		}
	}
}

