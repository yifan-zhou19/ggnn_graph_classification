package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		int p;
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
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
			if (a[i][0] == 95 || (a[i][0] >= 97 && a[i][0] <= 122) || (a[i][0] >= 65 && a[i][0] <= 90))
			{
			m = String.valueOf(a[i]).length();
			p = 0;
			for (j = 1;j < m;j++)
			{

			if (a[i][j] == 95 || (a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 97 && a[i][j] <= 122) || (a[i][j] >= 65 && a[i][j] <= 90))
			{
				p = p + 1;
			}
			}

			if (p == m - 1)
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

	}
}

