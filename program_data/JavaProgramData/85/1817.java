package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] xulie = new char[100][21];
		int i;
		int j;
		int n;
		int c;
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
				xulie[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((xulie[i][0] == 95) || (xulie[i][0] >= 65 && xulie[i][0] <= 90) || (xulie[i][0] >= 97 && xulie[i][0] <= 122))
			{
			for (j = 1;j < String.valueOf(xulie[i]).length();j++)
			{
				if ((xulie[i][j] >= 33 && xulie[i][j] <= 47) || (xulie[i][j] >= 58 && xulie[i][j] <= 64) || (xulie[i][j] >= 91 && xulie[i][j] <= 94) || (xulie[i][j] == 96) || (xulie[i][j] >= 123 && xulie[i][j] <= 127))
				{
					c = 0;
					break;
				}
				else
				{
					c = 1;
				}
			}
			}
			else
			{
				c = 0;
			}
			if (c == 1)
			{
				System.out.print("yes\n");
			}
			if (c == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

