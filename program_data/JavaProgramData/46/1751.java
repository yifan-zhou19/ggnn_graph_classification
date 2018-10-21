package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int m;
		int i;
		int j;
		int m1;
		int m2;
		int n1;
		int n2;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		k = 0;
		m1 = 0;
		m2 = m - 1;
		n1 = 0;
		n2 = n - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		for (j = m1;j <= m2;j++)
		{
			System.out.printf("%d\n",a[n1][j]);
			k = k + 1;
			if (k == n * m)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		m2 = m2 - 1;
		for (i = n1 + 1;i <= n2;i++)
		{
			System.out.printf("%d\n",a[i][m2 + 1]);
			k = k + 1;
			if (k == n * m)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		n2 = n2 - 1;
		for (j = m2;j >= m1;j--)
		{
			System.out.printf("%d\n",a[n2 + 1][j]);
			k = k + 1;
			if (k == n * m)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		m1 = m1 + 1;
		for (i = n2;i > n1;i--)
		{
			System.out.printf("%d\n",a[i][m1 - 1]);
			k = k + 1;
			if (k == n * m)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto end;
			}
		}
		n1 = n1 + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		end:
		return 0;
	}
}

