package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[1000][100];
		int[] b = new int[1000];
		int[] c = new int[27];
		int[] s = new int[1000];
		int max;
		int i;
		int j;
		int k;
		int n;
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
				b[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = tempVar3.charAt(0);
			}
			s[i] = String.valueOf(a[i]).length();
		}
		for (j = 0;j < 26;j++)
		{
			c[j] = 0;
			for (i = 0;i < n;i++)
			{
				for (k = 0;k < s[i];k++)
				{
					if (a[i][k] == 65 + j)
					{
						c[j] = c[j] + 1;
					}
				}
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("%c\n",i + 65);
				System.out.printf("%d\n",c[i]);
				for (k = 0;k < n;k++)
				{
					for (j = 0;j < s[k];j++)
					{
						if (a[k][j] == 65 + i)
						{
							System.out.printf("%d\n",b[k]);
						}
					}
				}
			}
		}

	}
}

