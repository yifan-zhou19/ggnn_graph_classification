package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		char[][] z = new char[50][max];
		char a;
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
				z[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(z[i]).length();
			for (k = 0,j = l - 1;k <= j;k++,j--)
			{
				a = z[i][k];
				z[i][k] = z[i][j];
				z[i][j] = a;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (z[i][0] == 'r')
			{
				z[i][1] = '_';
			}
			else
			{
				if (z[i][0] == 'y')
				{
					z[i][1] = '_';
				}
				else
				{
					z[i][2] = '_';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(z[i]).length();
			for (k = 0,j = l - 1;k <= j;k++,j--)
			{
				a = z[i][k];
				z[i][k] = z[i][j];
				z[i][j] = a;
			}
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(z[i]).length();
			for (j = 0;j < l;j++)
			{
				if (z[i][j] == '_')
				{
					z[i][j] = '\0';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",z[i]);
		}
		return 0;
	}


}

