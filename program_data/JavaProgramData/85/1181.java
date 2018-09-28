package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int m = 0;
		char[][] zfc = new char[LEN][LEN];
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
			a = String.valueOf(zfc[i]).length();
			for (j = 0;j < a;j++)
			{
				if (j == 0)
				{
					if (zfc[i][j] < 65 || (zfc[i][j]>90 && zfc[i][j] < 95) || zfc[i][j] == 96 || zfc[i][j]>122)
					{
					break;

					}
				}
				else
				{
					if (zfc[i][j] < 48 || (zfc[i][j]>57 && zfc[i][j] < 65) || (zfc[i][j]>90 && zfc[i][j] < 95) || zfc[i][j] == 96 || zfc[i][j]>122)
					{
					break;

					}
					else
					{
						m++;

					}
				}

			}
			if (j == a)
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

