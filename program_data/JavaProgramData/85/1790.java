package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[100][21];
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

			k = String.valueOf(zfc[i]).length();
			for (j = 0;j < k;j++)
			{
				if (zfc[i][0] >= '0' && zfc[i][0] <= '9')
				{
					System.out.print("no\n");
					break;


				}
				 if (zfc[i][j] >= 'a' && zfc[i][j] <= 'z' || zfc[i][j] >= 'A' && zfc[i][j] <= 'Z' || zfc[i][j] == '_' || zfc[i][j] >= '0' && zfc[i][j] <= '9')
				 {
					continue;

				 }
				else
				{
					System.out.print("no\n");
					break;
				}


			}

		if (j == k)
		{
			System.out.print("yes\n");
		}
		}
		return 0;
	}


}

