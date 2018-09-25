package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int i;
		int j;
		int k;
		int c;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 25;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < i;j++)
			{
				if (a[i] <= a[j])
				{
					if (b[i] < b[j] + 1)
					{
						b[i] = b[j] + 1;
					}
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			c = 0;
			for (k = 0;k < i;k++)
			{
				if (b[k] > b[j])
				{
					c = 1;
				}
			}
			if (c == 0)
			{
				System.out.printf("%d\n",b[j]);
				break;
			}
		}
		return 0;
	}

}

