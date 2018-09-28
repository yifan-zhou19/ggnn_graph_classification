package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int x;
		int b;
		int c;
		int m;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		b = 0;

		for (x = 1;x <= n;x++)
		{
			if (b <= a[x])
			{
			  b = a[x];
			  m = x;
			}
			else
			{
			b = b;
			}
		}
		System.out.printf("%d\n",b);

		c = 0;
		a[m] = 0;
		  for (x = 1;x <= n;x++)
		  {
			if (c <= a[x])
			{
			c = a[x];
			}
			else
			{
			c = c;
			}
		  }
		System.out.printf("%d",c);

	}
}

