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
		char[][] zfc = new char[50][20];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			int k;
			int flag = 0;
			k = String.valueOf(zfc[i]).length();
			if (zfc[i][0] == 95 || (zfc[i][0] >= 65 && zfc[i][0] <= 90) || (zfc[i][0] >= 97 && zfc[i][0] <= 122))
			{
				flag = 1;
				for (j = 1;j < k;j++)
				{
					if (zfc[i][j] == 95 || (zfc[i][j] >= 65 && zfc[i][j] <= 90) || (zfc[i][j] >= 97 && zfc[i][j] <= 122) || zfc[i][j] == '0' || zfc[i][j] == '1' || zfc[i][j] == '2' || zfc[i][j] == '3' || zfc[i][j] == '4' || zfc[i][j] == '5' || zfc[i][j] == '6' || zfc[i][j] == '7' || zfc[i][j] == '8' || zfc[i][j] == '9')
					{
						flag++;
					}
				}
				if (flag == k)
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

