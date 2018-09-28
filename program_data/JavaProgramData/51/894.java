package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[500][5];
		String d = new String(new char[501]);
		int n;
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			d = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,(Character.SIZE / Byte.SIZE));
		int l;
		l = d.length();
		m = l - n + 1;
		int q;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[i][j] = d.charAt(i + j);
			}
		}
		int[] b = new int[500];
		for (i = 0;i < m;i++)
		{
			b[i] = 1;
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
				if (strcmp(c[i],c[j]) == 0)
				{
					b[i]++;

					b[j] = 0;
				}
			}
		}
		q = b[0];
		for (i = 0;i < m;i++)
		{
			if (b[i] > q)
			{
				q = b[i];
			}
		}
		if (q > 1)
		{
			System.out.printf("%d\n",q);
			for (i = 0;i < m;i++)
			{
			if (b[i] == q && c[i][0] >= 'a' && c[i][0] <= 'z')
			{
				System.out.printf("%s\n",c[i]);
			}
			}

		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}

}

