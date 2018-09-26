package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[50][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
			int l = String.valueOf(a[i]).length();
			if (a[i][l - 1] == 'r' || a[i][l - 1] == 'y')
			{
				a[i][l - 2] = '\0';
				a[i][l - 1] = '\0';
			}
			else
			{
				a[i][l - 2] = '\0';
				a[i][l - 1] = '\0';
				a[i][l - 3] = '\0';
			}
		}
		int j;
		for (j = 0;j < n;j++)
		{
			System.out.println(a[j]);
		}

	}
}

