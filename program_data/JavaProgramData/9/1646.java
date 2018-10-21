package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k;
		int l;
		int z;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] f = new int[100];
		String d = new String(new char[30]);
		char[][] c = new char[100][30];
		char[][] e = new char[100][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,z = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				b[z] = a[i];
				f[z] = z;
				e[z] = c[i];
				a[i] = 0;
				z++;
			}
		}
		for (i = 0;i < z;i++)
		{
			for (j = i + 1;j < z;j++)
			{
				if (b[j] > b[i])
				{
					d = e[i];
					e[i] = e[j];
					e[j] = d;
					k = b[i];
					b[i] = b[j];
					b[j] = k;
					l = f[i];
					f[i] = f[j];
					f[j] = l;
				}
				if (b[i] == b[j])
				{
					if (f[i] > f[j])
					{
					d = e[i];
					e[i] = e[j];
					e[j] = d;
					k = b[i];
					b[i] = b[j];
					b[j] = k;
					l = f[i];
					f[i] = f[j];
					f[j] = l;
					}
				}
			}
		}
		for (i = 0;i < z;i++)
		{
			System.out.printf("%s\n",e[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%s\n",c[i]);
			}
		}
		return 0;
	}
}

