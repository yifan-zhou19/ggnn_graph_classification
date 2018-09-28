package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		char[][] zfc = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			for (t = 0;zfc[i][t] != 0;t++)
			{
				if (zfc[i][t] < '0' || (zfc[i][t]>'9' && zfc[i][t] < 'A') || (zfc[i][t]>'Z' && zfc[i][t] < '_') || (zfc[i][t]>'_' && zfc[i][t] < 'a') || zfc[i][t]>'z')
				{
					System.out.print("no\n");
					break;
				}
				else if (zfc[i][0] >= '0' && zfc[i][0] <= '9')
				{
					System.out.print("no\n");
					break;
				}
			}
			if (zfc[i][t] == 0)
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}

}

