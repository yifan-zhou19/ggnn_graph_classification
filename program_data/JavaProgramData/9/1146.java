package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		int[] e = new int[100];
		char[][] a = new char[100][100];
		for (i = 0;i < 100;i++)
		{
			b[i] = i;
		}
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
				c[i] = Integer.parseInt(tempVar3);
			}
			if (c[i] > 59)
			{
				d[i] = c[i];
			}
			else
			{
				e[i] = c[i];
			}
		}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n - 1;j++)
				{
					if (d[b[j]] < d[b[j + 1]])
					{
						k = b[j];
						b[j] = b[j + 1];
						b[j + 1] = k;
					}
				}
			}

			for (i = 0;i < n;i++)
			{
				if (d[b[i]] > 0)
				{
					System.out.printf("%s\n",a[b[i]]);
				}
				else
				{
					break;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (e[i] != 0)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
			return 0;
	}



}

