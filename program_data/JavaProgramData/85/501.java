package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int z;
		int len;
		char[][] c = new char[1000][20];
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
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			z = 0;
			if ((c[i][0] < 'A') || (c[i][0]>'Z' && c[i][0] < '_') || (c[i][0] == 96) || (c[i][0]>'z'))
			{
				System.out.print("no\n");
				continue;
			}
			len = String.valueOf(c[i]).length();
			for (j = 1;j < len;j++)
			{
				if ((c[i][j] < '0') || (c[i][j]>'9' && c[i][j] < 'A') || (c[i][j]>'Z' && c[i][j] < '_') || (c[i][j] == 96) || (c[i][j]>'z'))
				{
					System.out.print("no\n");
					z = 1;
					break;
				}
			}
			if (z != 1)
			{
			System.out.print("yes\n");
			}
		}
	}

}

