package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[1000][20];
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
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if ((a[i][j] < '0' || a[i][j]>'z' || (a[i][j] < 'a' && a[i][j]>'Z') || (a[i][j] < 'A' && a[i][j]>'9')) && a[i][j] != '_')
				{
					k = 0;
					break;
				}
				else if (a[i][0] >= '0' && a[i][0] <= '9')
				{
					k = 0;
					break;
				}
				k = 1;
			}
			if (k != 0)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

