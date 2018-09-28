package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int e;
		int[] c = new int[600];
		int m;
		int d = 0;
		int f = 0;
		String a = new String(new char[600]);
		char[][] b = new char[600][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][n] = '\0';
		}
		for (i = 0;i <= l - n;i++)
		{
			for (j = i + 1;j <= l - n;j++)
			{
				e = strcmp(b[i],b[j]);
				if (e == 0)
				{
					c[i]++;
				}
			}
		}
		m = c[0];
		for (i = 0;i <= l - n;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
			}
		}
		if (m == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m + 1);
			for (i = 0;i <= l - n;i++)
			{
				if (c[i] == m)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		return 0;
	}






}

