package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] c = new int[500];
		int m;
		int i;
		int j;
		int max;
		String s = new String(new char[500]);
		char[][] b = new char[500][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		m = s.length();
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				b[i][j] = s.charAt(i + j);
			}
			b[i][n] = '\0';
		}
		for (i = 0;i <= m - n;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i <= m - n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (strcmp(b[i],b[j]) == 0)
				{
					c[j] = c[j] + 1;
				}
			}
		}
		max = c[0];
		for (i = 1;i <= m - n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
		for (i = 0;i <= m - n;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("%s\n",b[i]);
			}
		}
		}
	}

}

