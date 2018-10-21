package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int l;
		int[] a = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		char[][] b = new char[100][11];
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
			d[i] = a[i];
			c[i] = i;
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (d[i] < d[i + 1])
				{
					k = d[i];
					d[i] = d[i + 1];
					d[i + 1] = k;
					k = c[i];
					c[i] = c[i + 1];
					c[i + 1] = k;
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (d[j] < 60)
			{
				l = j;
				break;
			}
		}
		for (j = 0;j < l;j++)
		{
			k = c[j];
			System.out.printf("%s\n",b[k]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
	return 0;



	}

}

