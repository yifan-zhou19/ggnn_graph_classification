package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][80];
		String c = new String(new char[100]);
		int n;
		int l;
		int i;
		int j;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			l = String.valueOf(a[i]).length();
			for (j = 0;j < l;j++)
			{
				if (((a[i][0] >= 'A' && a[i][0] <= 'Z') || (a[i][0] >= 'a' && a[i][0] <= 'z') || a[i][0] == '_') && ((a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= 'a' && a[i][j] <= 'z') || a[i][j] == '_' || (a[i][j] >= '0' && a[i][j] <= '9')))
				{
					flag = flag;
				}
				else
				{
					flag++;
				}
			}
			if (flag == 0)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
			flag = 0;
		}
		return 0;
	}
}

