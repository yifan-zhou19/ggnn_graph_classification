package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[100][21];
		int n;
		int i;
		int k;
		int[] jieguo = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((zfc[i][0] >= 'a' && zfc[i][0] <= 'z') || (zfc[i][0] >= 'A' && zfc[i][0] <= 'Z') || zfc[i][0] == '_')
			{
				for (k = 0;zfc[i][k] != '\0';k++)
				{
					if ((zfc[i][k] >= 'a' && zfc[i][k] <= 'z') || (zfc[i][k] >= 'A' && zfc[i][k] <= 'Z') || (zfc[i][k] >= '0' && zfc[i][k] <= '9') || zfc[i][k] == '_')
					{
						continue;
					}
					else
					{
						jieguo[i] = 99;
					}
				}
			}
			else
			{
				jieguo[i] = 99;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (jieguo[i] == 99)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}
}

