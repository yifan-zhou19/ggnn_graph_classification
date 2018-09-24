package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		char[][] s = new char[500][5];
		char tmp;
		int[] m = new int[500];
		int n;
		int i;
		int j;
		int max;
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
		for (i = 0;i <= 499;i++)
		{
			m[i] = 1;
		}
		for (i = 0;i <= a.length() - n;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				s[i][j] = a.charAt(i + j);
			}
			s[i][n] = '\0';
		}
		for (i = 0;i <= a.length() - n - 1;i++)
		{
			if (m[i] == -1)
			{
				continue;
			}
			for (j = i + 1;j <= a.length() - n;j++)
			{
				if (strcmp(s[i],s[j]) == 0)
				{
					m[i]++;
					m[j] = -1;
				}
			}
		}
		max = m[0];
		for (i = 0;i <= a.length() - n;i++)
		{
			max = (max > m[i])? max : m[i];
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
			for (i = 0;i <= a.length() - n;i++)
			{
				if (m[i] == max)
				{
					System.out.printf("%s\n",s[i]);
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

