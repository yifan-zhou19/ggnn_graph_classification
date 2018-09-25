package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		char[][] zfc = new char[N][LEN + 1];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[j] = tempVar2.charAt(0);
			}
		}
		int i;
		int pd;
		int pdjg;
		for (j = 0;j < n;j++)
		{
			pdjg = 0;
			int p = String.valueOf(zfc[j]).length();
			if ((zfc[j][0] >= 'a' && zfc[j][0] <= 'z') || (zfc[j][0] >= 'A' && zfc[j][0] <= 'Z') || zfc[j][0] == '_')
			{
				for (i = 1;i < p;i++)
				{
					if ((zfc[j][i] >= 'a' && zfc[j][i] <= 'z') || (zfc[j][i] >= 'A' && zfc[j][i] <= 'Z') || (zfc[j][i] >= '0' && zfc[j][i] <= '9') || zfc[j][i] == '_')
					{
						pd = 1;
						pdjg += pd;
					}
					else
					{
						pd = 0;
						pdjg += pd;
					}
				}
			}
			else
			{
				pdjg = 0;
			}
			if (pdjg == p - 1)
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

