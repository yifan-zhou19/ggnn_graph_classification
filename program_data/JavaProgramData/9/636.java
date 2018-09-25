package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int m;
		int l;
		int[] b = new int[100];
		int[] d = new int[100];
		int[] g = new int[100];
		char[][] a = new char[100][10];
		char[][] c = new char[100][10];
		String e = new String(new char[10]);
		char[][] f = new char[100][10];
		m = 0;
		l = 0;
		t = 0;
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{
				c[m] = a[i];
				d[m] = b[i];
				m = m + 1;
			}
			else
			{
				f[l] = a[i];
				g[l] = b[i];
				l = l + 1;

			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - i - 1;j++)
			{
							  if (d[j] < d[j + 1])
							  {
				 t = d[j];
				 d[j] = d[j + 1];
				 d[j + 1] = t;
				 e = c[j];
				 c[j] = c[j + 1];
				 c[j + 1] = e;
							  }
			}
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%s\n",c[i]);
		}
		for (i = 0;i < l;i++)
		{
		System.out.printf("%s\n",f[i]);
		}















		System.in.read();
		System.in.read();
	}



}

