package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] dc = new char[50][30];
		int i;
		int[] sz = new int[50];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dc[i] = tempVar2.charAt(0);
			}
			sz[i] = String.valueOf(dc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (dc[i][sz[i] - 1] == 'g')
			{
				int j;
				for (j = 0;j < sz[i] - 3;j++)
				{
					System.out.printf("%c",dc[i][j]);
				}
			}
			else
			{
				int j;
				for (j = 0;j < sz[i] - 2;j++)
				{
					System.out.printf("%c",dc[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

