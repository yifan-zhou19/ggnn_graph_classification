package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int d = 0;
		int q;
		int j;
		int[] b = new int[101];
		int[] f = new int[101];
		char[][] a = new char[101][10];
		char[][] c = new char[101][10];
		char[][] e = new char[101][10];
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
		q = n - 1;
		j = 0;
		for (i = n - 1;i >= 0;i--)
		{
				if (b[i] < 60)
				{

					c[q] = a[i];
					q = q - 1;
				}

		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 60)
			{

				c[j] = a[i];
				f[j] = b[i];
				d = d + 1;
				j = j + 1;
			}
		}
		for (i = 0;i < d;i++)
		{
			for (j = 0;j < d - 1;j++)
			{
				if (f[j] < f[j + 1])
				{
					f[100] = f[j];
					f[j] = f[j + 1];
					f[j + 1] = f[100];
					c[100] = c[j];
					c[j] = c[j + 1];
					c[1 + j] = c[100];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}


	}
}

