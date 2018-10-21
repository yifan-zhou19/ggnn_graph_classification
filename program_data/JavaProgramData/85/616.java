package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] len = new int[100];
		char[][] zfc = new char[100][20];
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
				zfc[i] = tempVar2.charAt(0);
			}
			len[i] = String.valueOf(zfc[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			a[i] = 0;
			for (j = 0;zfc[i][j] != 0;j++)
			{
				if (((zfc[i][0] <= 'z' && zfc[i][0] >= 'a') || (zfc[i][0] <= 'Z' && zfc[i][0] >= 'A') || (zfc[i][0] == '_')) && ((zfc[i][j] <= 'z' && zfc[i][j] >= 'a') || (zfc[i][j] <= 'Z' && zfc[i][j] >= 'A') || (zfc[i][j] <= '9' && zfc[i][j] >= '0') || zfc[i][j] == '_'))
				{
					a[i]++;
				}
				else
				{
					a[i] += 2;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == len[i])
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

