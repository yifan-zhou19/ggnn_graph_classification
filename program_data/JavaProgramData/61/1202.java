package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int m;
		int e;
		b[0] = 1;
		b[1] = 1;
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
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
			if ((a[i] == 1) || (a[i] == 2))
			{
				m = 1;
				System.out.printf("%d\n",m);
			}
			else
			{
				m = 2;
				for (m = 2;m < a[i];m++)
				{
					b[m] = b[m - 1] + b[m - 2];
					e = b[m];
				}
				System.out.printf("%d\n",e);
			}
		}
		return 0;
	}
}

