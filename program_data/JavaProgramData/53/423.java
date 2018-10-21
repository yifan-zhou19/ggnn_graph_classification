package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int j;
		int c = 0;
		int z = 0;
		int[] b = new int[302];
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
		for (i = n - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					c = c + 1;
				}
			}
			if (c == 0)
			{
				b[z] = a[i],z++;
			}
			c = 0;
		}
		b[z] = a[0];
		for (i = z;i > 0;i--)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[0]);
	}

}

