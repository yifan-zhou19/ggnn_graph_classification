package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][20];
		int n;
		int i;
		int j;
		int l;
		int flag = 0;
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
			flag = 0;
			l = String.valueOf(a[i]).length();
			if (l > 31)
			{
				System.out.print("no\n");
				continue;
			}
			if (a[i][0] < 'A' || a[i][0]>'z')
			{
				System.out.print("no\n");
				continue;
			}
			if (a[i][0] > 'Z' && a[i][0] < 'a' && a[i][0] != '_')
			{
				System.out.print("no\n");
				continue;
			}
			for (j = 1;j < l;j++)
			{
				if (a[i][j] < '0' || a[i][j]>'z')
				{
					System.out.print("no\n");
					flag = 1;
					break;
				}
				if (a[i][j] > '9' && a[i][j] < 'A')
				{
					System.out.print("no\n");
					flag = 1;
					break;
				}
				if (a[i][j] > 'Z' && a[i][j] < 'a' && a[i][j] != '_')
				{
					System.out.print("no\n");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			{
				System.out.print("yes\n");
			}
		}
	}
}

