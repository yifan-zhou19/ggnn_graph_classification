package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int[] shu = new int[100];
		char[][] zi = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zi[i] = tempVar2.charAt(0);
			}
			shu[i] = String.valueOf(zi[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if ((zi[i][shu[i - 1] == 'r']) && (zi[i][shu[i] - 2] == 'e'))
			{
				shu[i] = shu[i] - 2;
			}
			else if ((zi[i][shu[i - 1] == 'y']) && (zi[i][shu[i] - 2] == 'l'))
			{
				shu[i] = shu[i] - 2;
			}
			else if ((zi[i][shu[i] - 1] == 'g') && (zi[i][shu[i] - 2] == 'n') && (zi[i][shu[i] - 3] == 'i'))
			{
				shu[i] = shu[i] - 3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < shu[i];k++)
			{
				System.out.printf("%c",zi[i][k]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

