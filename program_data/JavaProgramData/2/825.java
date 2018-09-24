package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[1000];
		int[] c = new int[27];
		int i;
		int j;
		int k;
		int m;
		int p;
		int[] d = new int[1000];
		char[][] b =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				for (k = 1;k <= 26;k++)
				{
					if (b[i][j] == 64 + k)
					{
						c[k] = c[k] + 1;
					}
				}
			}
		}

		m = c[1];
		p = 1;
		for (i = 1;i < 27;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
				p = i;
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (b[i][j] == 64 + p)
				{
					d[i] = 1;
				}

			}
		}
		System.out.printf("%c\n",64 + p);
		System.out.printf("%d\n",m);
		for (i = 0;i < 1000;i++)
		{
			if (d[i] == 1)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
	}


}

