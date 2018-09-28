package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int k;
		int m;
		int n;
		int nbegin;
		int ncounted;
		while (m != 0 && n != 0)
		{
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
			for (i = 0;i < n;i++)
			{
				a[i] = 1;
			}
			nbegin = 0;
			for (i = 0;i < n;i++)
			{
				ncounted = 0;
				for (j = nbegin;ncounted < m;j = (j + 1) % n)
				{
					if (a[j] == 1)
					{
						ncounted++;
					}
					if (ncounted == m)
					{
						a[j] = 0;
						nbegin = (j + 1) % n;
					}
				}
				if (i == n - 1)
				{
					nbegin = (nbegin + n - 1) % n;
					System.out.printf("%d\n",nbegin + 1);
				}
			}
		}
		return 0;
	}



}

