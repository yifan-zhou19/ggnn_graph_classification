package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] c = new int[510];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[510]);
		char[][] m = new char[510][5];
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0;i <= s.length() - n;i++)
		{
			for (j = 0;j < n;j++)
			{
				m[i][j] = s.charAt(i + j);
			}
			m[i][n] = '\0';
		}
		for (i = 0;i <= s.length() - n;i++)
		{
			c[i] = 1;
			for (j = i + 1;j <= s.length() - n;j++)
			{
				if (strcmp(m[i],m[j]) == 0)
				{
					c[i]++;
				}
			}
		}
		for (i = 0;i <= s.length() - n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
		}
		if (max > 1)
		{
			System.out.printf("%d\n",max);
		for (i = 0;i <= s.length() - n;i++)
		{
			if (c[i] == max)
			{
				System.out.printf("%s\n",m[i]);
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

