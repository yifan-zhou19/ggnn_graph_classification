package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[30][30];
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i = i + 1)
		{
			a[i] = new Scanner(System.in).nextLine();
			m = String.valueOf(a[i]).length();
			if (a[i][m - 2] == 'e' && a[i][m - 1] == 'r')
			{
				a[i][m - 2] = '\0';
			}
			else if (a[i][m - 2] == 'l' && a[i][m - 1] == 'y')
			{
				a[i][m - 2] = '\0';
			}
			else if (a[i][m - 3] == 'i' && a[i][m - 2] == 'n' && a[i][m - 1] == 'g')
			{
				a[i][m - 3] = '\0';
			}
			System.out.printf("%s\n",a[i]);
		}
	}
}

