package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int s;
		int t = 0;
		int m;
		int q = 0;
		int[] d = new int[250];
		String a = new String(new char[500]);
		char[][] b = new char[250][5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		s = a.length();
		for (i = 0;i <= s - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][n] = 0;
		}

		for (i = 0;i <= s - n;i++)
		{
			m = 0;
			for (j = i + 1;j <= s - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					if (m == 0)
					{
						m = 2;
					}
					else
					{
						m = m + 1;
					}
				}
			}
			d[i] = m;
			if (d[i] > q)
			{
				q = d[i];
			}
		}
		if (q == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",q);
			for (i = 0;i <= s - n;i++)
			{
				if (d[i] == q)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
	}

}

