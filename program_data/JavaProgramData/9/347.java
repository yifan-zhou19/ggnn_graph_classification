package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int i = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int p = 0;
		int q = 0;
		int m = 0;
		char[][] sz1 = new char[100][100];
		char[][] a1 = new char[100][100];
		char[][] b1 = new char[100][100];
		String e = new String(new char[100]);
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
				sz1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] >= 60)
			{
				a[p] = sz[i];
				a1[p] = sz1[i];
				p++;
			}
			if (sz[i] < 60)
			{
				b[q] = sz[i];
				b1[q] = sz1[i];
				q++;
			}
		}
		for (i = 1;i < p;i++)
		{
			for (m = 0;m < p - i;m++)
			{
				if (a[m] < a[m + 1])
				{
					int t = a[m];
					a[m] = a[m + 1];
					a[m + 1] = t;
					e = a1[m];
					a1[m] = a1[m + 1];
					a1[m + 1] = e;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%s\n",a1[i]);
		}
		for (m = 0;m < q;m++)
		{
			System.out.printf("%s\n",(b1[m]));
		}


		return 0;
	}


}

