package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[600]);
		char[][] a = new char[600][10];
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,j,m,k,l;
		int n;
		int i;
		int j;
		int m;
		int k;
		int l;
		int[] b = new int[600];
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length();
		for (i = 0;i < 600;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < m - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = str.charAt(i + j);
			}
			a[i][n] = '\0';
		}
		for (i = 0;i < m - n + 1;i++)
		{
			if (b[i] == 1)
			{
				for (j = i + 1;j < m - n + 1;j++)
				{
					k = 0;
					for (l = 0;l < n;l++)
					{
						if (a[i][l] == a[j][l])
						{
							k++;
						}
					}
					if (k == n)
					{
						b[i]++;

					}
				}
			}


		}
		for (i = 0;i < m - n + 1;i++)
		{
			if (t < b[i])
			{
				t = b[i];
			}
		}
		if (t == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.printf("%d\n",t);
			for (i = 0;i < m - n + 1;i++)
			{
				if (b[i] == t)
				{
					System.out.printf("%s\n",a[i]);
				}
			}
		}
		return 0;
	}

}

