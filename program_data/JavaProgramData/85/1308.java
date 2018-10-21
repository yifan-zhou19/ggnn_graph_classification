package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] zfc = new char[100][20];
	int i;
	int j;
	int e;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zfc[i] = tempVar2.charAt(0);
	}
	}
	int k;

	for (i = 0;i < n;i++)
	{
		k = 0;

		for (j = 0;zfc[i][j] != '\0';j++)
		{
			if ((zfc[i][j] >= '0' && zfc[i][j] <= '9') || (zfc[i][j] == 95) || (zfc[i][j] >= 'A' && zfc[i][j] <= 'Z') || (zfc[i][j] >= 'a' && zfc[i][j] <= 'z'))
			{
				if (j == 0)
				{
					if (zfc[i][0] >= '0' && zfc[i][0] <= '9')
					{
					k += 1;
					}
					else
					{
					k += 0;
					}
				}
			k += 0;
			}
			else
			{
			k += 1;
			};
		}

		if (k == 0)
		{
			if (i == (n - 1))
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		else
		{
			if (i == (n - 1))
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("no\n");
			}
		}

	}

	return 0;
	}


}

