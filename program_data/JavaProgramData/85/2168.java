package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zfc = new char[100][21];
		int n;
		int i;
		int k;
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
			if ((zfc[i][0] >= 'A' && zfc[i][0] <= 'Z') || zfc[i][0] >= 'a' && zfc[i][0] <= 'z' || zfc[i][0] == '_')
			{
			int m = String.valueOf(zfc[i]).length();
			int c = 0;
			for (k = 1;k < m;k++)
			{
			if ((zfc[i][k] >= '0' && zfc[i][k] <= '9') || (zfc[i][k] >= 'A' && zfc[i][k] <= 'Z') || (zfc[i][k] >= 'a' && zfc[i][k] <= 'z') || zfc[i][k] == '_')
			{
				c++;
			}

			}
			if (c == (m - 1))
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
			}
		else
		{
			System.out.print("no\n");
		}
		}
		  return 0;

	}

}

