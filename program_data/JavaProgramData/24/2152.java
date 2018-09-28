package <missing>;

public class GlobalMembers
{
	// ??????.cpp : ??????????????
	//


	public static int Main()
	{
		char[][] a = new char[200][100];
		int i;
		int j;
		int k;
		int[] l = new int[200];
		int m;
		for (i = 0;i <= 199;++i)
		{
			for (j = 0;j <= 99;++j)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					a[i][j] = tempVar.charAt(0);
				}
				if (a[i][j] == ' ')
				{
					a[i][j] = '\0';
					break;
				}
				if (a[i][j] == '\n')
				{
					break;
				}
			}
			l[i] = j;
			if (a[i][j] == '\n')
			{
				a[i][j] = '\0';
				break;
			}
		}
		m = 0;
		for (k = 0;k <= i;++k)
		{
			if (m < l[k])
			{
				m = l[k];
			}
		}
		for (k = 0;k <= i;++k)
		{
			if (m == l[k])
			{
				break;
			}
		}
		System.out.printf("%s\n",a[k]);
		m = 9999;
		for (k = 0;k <= i;++k)
		{
			if (m > l[k])
			{
				m = l[k];
			}
		}
		for (k = 0;k <= i;++k)
		{
			if (m == l[k])
			{
				break;
			}
		}
		System.out.printf("%s\n",a[k]);
		return 0;
	}

}

