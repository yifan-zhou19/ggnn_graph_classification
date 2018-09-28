package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[301],c[301],t,b=0,d;
		int[] a = new int[301];
		int[] c = new int[301];
		int t;
		int b = 0;
		int d;
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
			b = b + a[i];
		}
		d = Math.abs(a[0] * n - b);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] * n - b) > d)
			{
				d = Math.abs(a[i] * n - b);
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] * n - b) == d)
			{
				c[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			k = i;
			for (m = i + 1;m < j;m++)
			{
				if (c[m] < c[k])
				{
					k = m;
				}
			}
			t = c[k];
			c[k] = c[i];
			c[i] = t;
		}
		for (i = 0;i < j;i++)
		{
			if (i != j - 1)
			{
				System.out.printf("%d,",c[i]);
			}
			else
			{
				System.out.printf("%d\n",c[i]);
			}
		}
	}
}

