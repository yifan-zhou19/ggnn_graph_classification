package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[N][21];
		for (int i = 0;i < n + 1;i++)
		{
			zfc[i] = new Scanner(System.in).nextLine();
		}
		b = String.valueOf(zfc[0]).length();
		for (int k = 0;k < n + 1;k++)
		{
			for (int m = 0;m < b;m++)
			{
				if (m == 0)
				{
					if ((zfc[k][m] == '_') || (zfc[k][m] >= 'a' && zfc[k][m] <= 'z') || (zfc[k][m] >= 'A' && zfc[k][m] <= 'Z'))
					{
						continue;
					}
				else
				{
					System.out.print("no\n");
					break;
				}
				}
				if (m != 0 && m + 1 != b)
				{
					if ((zfc[k][m] == '_') || (zfc[k][m] >= 'a' && zfc[k][m] <= 'z') || (zfc[k][m] >= 'A' && zfc[k][m] <= 'Z') || (zfc[k][m] >= '0' && zfc[k][m] <= '9'))
					{
					continue;
					}
				else
				{
					System.out.print("no\n");
					break;
				}
				}
				if (m + 1 == b)
				{
					if ((zfc[k][m] == '_') || (zfc[k][m] >= 'a' && zfc[k][m] <= 'z') || (zfc[k][m] >= 'A' && zfc[k][m] <= 'Z') || (zfc[k][m] >= '0' && zfc[k][m] <= '9'))
					{
						System.out.print("yes\n");
					}
					else
					{
						System.out.print("no\n");
					}
				}
			}
		b = String.valueOf(zfc[k + 1]).length();
		}
		return 0;
	}


}

