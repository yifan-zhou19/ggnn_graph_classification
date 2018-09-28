package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[N][M];
		int n;
		int i;
		int j;
		int k = 0;
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
		}
		for (i = 0;i < n;i++)
		{
			if (zfc[i][0] >= 'A' && zfc[i][0] <= 'Z' || zfc[i][0] >= 'a' && zfc[i][0] <= 'z')
			{
				k++;
			}
			else if (zfc[i][0] == '_')
			{
				k++;
			}
			for (j = 1;zfc[i][j] != '\0';j++)
			{
				if (zfc[i][j] >= '0' && zfc[i][j] <= '9')
				{
					k++;
				}
				else if (zfc[i][j] >= 'A' && zfc[i][j] <= 'Z' || zfc[i][j] >= 'a' && zfc[i][j] <= 'z')
				{
					k++;
				}
				else if (zfc[i][j] == '_')
				{
					k++;
				}
			}
			if (k == j)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			k = 0;
		}
		return 0;
	}
}

