package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		void xu(int a[],int l);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		xu(b, n);
		xu(c, m);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d ",b[i]);
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",c[i]);
		}
		System.out.printf("%d\n",c[m - 1]);
	}

	public static void xu(int[] a, int l)
	{
		int j = 0;
		int k;
		int t;
		while (j < l)
		{
			k = j + 1;
			while (k < l)
			{
				if (a[j] > a[k])
				{
					t = a[j];
					a[j] = (a + k);
					a[k] = t;
				}
				k++;
			}
			j++;
		}
	}
}

