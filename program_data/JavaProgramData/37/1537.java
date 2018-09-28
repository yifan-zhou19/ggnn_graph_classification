package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[1000][1000];
		for (int i = 0;i < n;i++)
		{
			zfc[i] = new Scanner(System.in).nextLine();
		}
		for (int i = 0;i < n;i++)
		{
			int m = String.valueOf(zfc[i]).length();
			for (int j = 0;j < m;j++)
			{
				s = 0;
				for (int k = 0;k < m;k++)
				{
					if (zfc[i][j] == zfc[i][k])
					{
						s = s + 1;
					}
				}
				if (s == 1)
				{
					System.out.printf("%c\n",zfc[i][j]);
					break;
				}
				if (j == m - 1)
				{
					System.out.print("no\n");
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}

}

