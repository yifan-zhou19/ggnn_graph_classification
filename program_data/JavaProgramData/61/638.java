package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[20];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[0] = 1;
			a[1] = 1;
			c[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 1 || m == 2)
			{
				c[i] = 1;
			}
			else
			{
				c[i] = 2;
				for (j = 2;j < m;j++)
				{
					a[j] = a[j - 2] + a[j - 1];
					c[i] = a[j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
		return 0;
	}
}

