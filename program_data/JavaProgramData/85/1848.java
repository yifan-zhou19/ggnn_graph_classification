package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sum = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[1000][20];
		int i;
		int j;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(zfc[i]) = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			sum[i] = 1;
			if (zfc[i][0] <= 57 && zfc[i][0] >= 48)
			{
			sum[i] = 0;
			}
			for (j = 0;zfc[i][j] != '\0';j++)
			{
				if ((zfc[i][j] >= 65 && zfc[i][j] <= 90) || (zfc[i][j] >= 97 && zfc[i][j] <= 122) || (zfc[i][j] == 95) || (zfc[i][j] >= 48 && zfc[i][j] <= 57))
				{
					;
				}
			else
			{
				sum[i] = 0;
				break;
			}
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (sum[i] == 0)
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

