package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sz = new char[50][100];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int k;
		int[] sm = new int[50];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2.charAt(0);
			}
			sm[i] = String.valueOf(sz[i]).length();
			k = sm[i];
			if (sz[i][k - 1] == 'r' && sz[i][k - 2] == 'e')
			{
			sz[i][k - 2] = 0;
			System.out.printf("%s\n",sz[i]);
			}
			if (sz[i][k - 1] == 'y' && sz[i][k - 2] == 'l')
			{
			sz[i][k - 2] = 0;
			System.out.printf("%s\n",sz[i]);
			}
			if (sz[i][k - 1] == 'g' && sz[i][k - 2] == 'n' && sz[i][k - 3] == 'i')
			{
			sz[i][k - 3] = 0;
			System.out.printf("%s\n",sz[i]);
			}
		}
		return 0;
	}
}

