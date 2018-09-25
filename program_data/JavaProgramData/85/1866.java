package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int special = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] a = new char[n][22];
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
			for (j = 0;a[i][j] != '\0';j++)
			{
			if (a[i][0] >= 48 && a[i][0] <= 57)
			{
				System.out.print("no\n");
				special++;
				break;
			}
			if (a[i][j] != 95 && (a[i][j] < 65 || a[i][j]>90) && (a[i][j] < 97 || a[i][j]>122) && (a[i][j] < 48 || a[i][j]>57))
			{
				System.out.print("no\n");
				special++;
				break;
			}
			}
			if (special == 0)
			{
				System.out.print("yes\n");
			}
			special = 0;
		}
		return 0;
	}
}

