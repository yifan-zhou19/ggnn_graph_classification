package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		char[][] a = new char[50][10000];
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			int j;
			int len = String.valueOf(a[i]).length();
			if (a[i][len - 2] == 'e' && a[i][len - 1] == 'r' || a[i][len - 2] == 'l' && a[i][len - 1] == 'y')
			{
				for (j = 0;j < len - 2;j++)
				{
					System.out.print(a[i][j]);
				}
			}
			if (a[i][len - 3] == 'i' && a[i][len - 2] == 'n' && a[i][len - 1] == 'g')
			{
				for (j = 0;j < len - 3;j++)
				{
					System.out.print(a[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

