package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] bn = new int[1000];
		char[][] an = new char[1000][21];
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
				an[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			bn[i] = String.valueOf(an[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (an[i][0] < 65 || (an[i][0]>90 && an[i][0] < 95) || an[i][0] == 96 || an[i][0]>122)
			{
				System.out.print("no\n");
				continue;
			}
			else
			{
				for (j = 1;j < bn[i];j++)
				{
					if (an[i][j] < 48 || (an[i][j] >= 58 && an[i][j] <= 64) || (an[i][j] >= 91 && an[i][j] <= 94) || an[i][j] == 96 || an[i][j] >= 123)
					{
						System.out.print("no\n");
						break;
					}
					if (j == bn[i] - 1)
					{
						System.out.print("yes\n");
					}
				}
			}
		}
			return 0;
	}
}

