package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		char[][] a = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
			l = String.valueOf(a[i]).length();
			if (a[i][l - 2] == 'e' && a[i][l - 1] == 'r')
			{
				for (j = 0;j <= l - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
					System.out.print("\n");
			}
			else if (a[i][l - 3] == 'i' && a[i][l - 2] == 'n' && a[i][l - 1] == 'g')
			{
				for (j = 0;j <= l - 4;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
					System.out.print("\n");
			}
			else if (a[i][l - 2] == 'l' && a[i][l - 1] == 'y')
			{
				for (j = 0;j <= l - 3;j++)
				{
					 System.out.printf("%c",a[i][j]);
				}
					System.out.print("\n");
			}
			else
			{
				System.out.printf("%s",a[i]);
			}
		}
	}
}

