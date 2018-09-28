package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int r = 0;
		int t = 0;
		int l;
		int i;
		int j;
		int m = 0;
		int[] c = new int[500];
		String a = new String(new char[500]);
		char[][] b = new char[500][5];
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
		for (i = 0;i < l - n + 1;i++)
		{
			b[i][n] = '\0';
			r = 0;
			for (j = 0;j < n;j++)
			{
				b[i][j] = a.charAt(r + t);
				r++;
			}
			t++;
		}
		for (i = 0;i < l - n + 1;i++)
		{
			for (j = 0;j < l - n + 1;j++)
			{
				if (strcmp(b[j],b[i]) == 0)
				{
					c[i]++;
				}
			}
		}
		for (i = 0;i < l - n + 1;i++)
		{
			if (c[i] > m)
			{
				m = c[i];
			}
		}
		if (m == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",m);
			for (i = 0;i < l - n + 1;i++)
			{
				if (c[i] == m)
				{
					for (j = 0;j < i;j++)
					{
						if (strcmp(b[j],b[i]) == 0)
						{
							break;
						}
					}
					if (j >= i)
					{
						System.out.printf("%s\n",b[i]);
					}
				}
			}
		}
		return 0;
	}











}

