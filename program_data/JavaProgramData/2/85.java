package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[26];
		char[] z = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		char[][][] nn = new char[26][100][20];
		int m;
		int i;
		int j;
		int r;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = tempVar2.charAt(0);
			}
			String b = new String(new char[20]);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			int w = b.length();
			for (i = 0;i < w;i++)
			{
				for (r = 0;r < 26;r++)
				{
					if (b.charAt(i) == z[r])
					{
						n[r]++;
						nn[r][n[r]] = a[j];
					}
				}
			}
		}
			int c = 0;
			for (r = 1;r < 26;r++)
			{
				if (n[r] > n[c])
				{
					c = r;
				}
			}
			System.out.printf("%c\n%d\n",z[c],n[c]);
			for (i = 1;i <= n[c];i++)
			{
				System.out.printf("%s\n",nn[c][i]);
			}
	}

}

