package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[50][20];
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
			if (a[i][String.valueOf(a[i]).length() - 3] == 'i')
			{
				for (j = 0;j < String.valueOf(a[i]).length() - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print("\n");
			}
			if (a[i][String.valueOf(a[i]).length() - 2] == 'e' || a[i][String.valueOf(a[i]).length() - 2] == 'l')
			{
				for (j = 0;j < String.valueOf(a[i]).length() - 2;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}

