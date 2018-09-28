package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 0;
		int n;
		int len;
		int[] C = new int[500];
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
		char[][] c = new char[500][5];
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
		len = a.length();
		for (i = 0;i < len;i++)
		{
			C[i] = 1;
		}

		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < n;j++)
			{
			b[i][j] = a.charAt(i + j);
			}
			b[i][j] = '\0';
		}
		for (i = 0;i < len - n + 1;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (strcmp(b[i],c[j]) == 0)
				{
					C[j]++;
					break;
				}
			}
			if (j == t)
			{
				c[t] = b[i];
				t++;
			}
		}
		j = 1;
		for (i = 0;i < t;i++)
		{
			if (C[i] > j)
			{
				j = C[i];
			}
		}
		if (j == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",j);
			for (i = 0;i < t;i++)
			{
				if (C[i] == j)
				{
				System.out.printf("%s\n",c[i]);
				}
			}
		}
	}



}

