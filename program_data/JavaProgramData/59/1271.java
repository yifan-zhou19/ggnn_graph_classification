package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[120][120];
		char[][] s = new char[120][120];
		String c1 = new String(new char[10]);
		int i;
		int m;
		int n;
		int j;
		int o;
		int p;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		for (o = 1;o <= m - 1;o++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			for (i = 0;i <= n - 1;i++)
			{
			for (j = 0;j <= n - 1;j++)
			{
			if (s[i][j] == '@')
			{
			   if ((s[i - 1][j] == '.') && (i > 0))
			   {
				   a[i - 1][j] = 1;
			   }
			   if ((s[i][j - 1] == '.') && (j > 0))
			   {
				   a[i][j - 1] = 1;
			   }
			   if ((s[i + 1][j] == '.') && (i < n - 1))
			   {
				   a[i + 1][j] = 1;
			   }
			   if ((s[i][j + 1] == '.') && (j < n - 1))
			   {
				   a[i][j + 1] = 1;
			   }
			}
			}
			}
			for (i = 0;i <= n - 1;i++)
			{
			for (j = 0;j <= n - 1;j++)
			{
			if (a[i][j] == 1)
			{
				s[i][j] = '@';
			}
			}
			}
		}
		p = 0;

		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
			if (s[i][j] == '@')
			{
				p++;
			}
			}
		}
			System.out.printf("%d",p);

			return 0;
	}

}

