package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ch = System.in.read();
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			b[i] = 0;
			ch = System.in.read();
		}
		for (i = n - 1;i >= 0;i--)
		{
			b[i] = 0;
			for (j = i;j <= n - 1;j++)
			{
				if (b[j] > b[i] && a[j] <= a[i])
				{
					b[i] = b[j];
				}
			}
			b[i] = b[i] + 1;
		}
		c = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (b[i] > c)
			{
				c = b[i];
			}
		}
		System.out.printf("%d",c);
		return (0);
	}

}

