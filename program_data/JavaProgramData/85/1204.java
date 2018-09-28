package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] len = new int[22];
		int n;
		int ans;
		char[][] zfc = new char[100][22];
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
			len[i] = String.valueOf(zfc[i]).length();
			for (j = 0;j < len[i];j++)
			{
				ans = 1;
				if (!((zfc[i][j] >= '0' && zfc[i][j] <= '9' && j>0) || (zfc[i][j] >= 'A' && zfc[i][j] <= 'Z') || (zfc[i][j] >= 'a' && zfc[i][j] <= 'z') || (zfc[i][j] == '_')))
				{
					ans = 0;
				break;
				}
			}
			if (ans == 1)
			{
				System.out.print("yes\n");
			}
			else if (ans == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

