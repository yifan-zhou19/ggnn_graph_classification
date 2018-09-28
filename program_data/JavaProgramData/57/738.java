package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sz = new char[n][33];
		int[] num = new int[n];
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2.charAt(0);
			}
			num[i] = String.valueOf(sz[i]).length();
		}
		for (i = 0; i < n; i++)
		{
			if (sz[i][num[i] - 2] == 'l' && sz[i][num[i] - 1] == 'y')
			{
				sz[i][num[i] - 2] = '\0';
				sz[i][num[i] - 1] = '\0';
			}
			else if (sz[i][num[i] - 2] == 'e' && sz[i][num[i] - 1] == 'r')
			{
				sz[i][num[i] - 2] = '\0';
				sz[i][num[i] - 1] = '\0';
			}
			else if (sz[i][num[i] - 3] == 'i' && sz[i][num[i] - 2] == 'n' && sz[i][num[i] - 1] == 'g')
			{
				sz[i][num[i] - 3] = '\0';
				sz[i][num[i] - 2] = '\0';
				sz[i][num[i] - 1] = '\0';
			}
		}
		for (i = 0; i < n; i++)
		{
			System.out.printf("%s\n", sz[i]);
		}
	}

}

