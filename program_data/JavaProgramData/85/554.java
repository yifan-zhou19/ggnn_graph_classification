package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[20][100];
		int i;
		int j;
		int n;
		int flag;
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			flag = 1;
			if ((a[i][0] >= 65 && a[i][0] <= 90) || (a[i][0] >= 97 && a[i][0] <= 122) || (a[i][0] >= 128) || a[i][0] == 95)
			{
				;
			}
			else
			{
				flag = 0;
			}
			for (j = 1;a[i][j] != '\0';j++)
			{
				if ((a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] >= 128) || a[i][j] == 95)
				{
					;
				}
				else
				{
					flag = 0;
				}
			}
			if (flag != 0)
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

