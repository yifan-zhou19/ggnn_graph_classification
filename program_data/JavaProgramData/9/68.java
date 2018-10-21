package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] c = new int[100];
		int m = 0;
		int[] e = new int[100];
		int k = 0;
		int x;
		char[][] b = new char[100][10];
		char[][] d = new char[100][10];
		char[][] f = new char[100][10];
		String y = new String(new char[10]);
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
				b[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				c[m] = a[i];
				d[m] = b[i];
				m++;
			}
			else
			{
				e[k] = a[i];
				f[k] = b[i];
				k++;
			}
		}
		for (j = 0;j < m - 1;j++)
		{
			for (i = 0;i < m - j - 1;i++)
			{
				if (c[i] < c[i + 1])
				{
					x = c[i];
					c[i] = c[i + 1];
					c[i + 1] = x;
					y = d[i];
					d[i] = d[i + 1];
					d[i + 1] = y;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",d[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s\n",f[i]);
		}
	}
}

