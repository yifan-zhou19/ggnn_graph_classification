package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[505]);
		char[][] b = new char[505][6];
		int n;
		int i;
		int j;
		int k;
		int l;
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
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(i + j);
			}
			b[i][n] = 0;
		}
		l = 1;
		for (i = 0;i <= a.length() - n;i++)
		{
			k = 0;
			for (j = 0;j <= a.length() - n;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					k++;
				}
			}
			if (k > l)
			{
				l = k;
			}
		}
		if (l == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",l);
			for (i = 0;i <= a.length() - n;i++)
			{
				k = 0;
				for (j = i;j <= a.length() - n;j++)
				{
					if (strcmp(b[i],b[j]) == 0)
					{
						k++;
					}
				}
				if (k == l)
				{
					System.out.printf("%s\n",b[i]);
				}
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

