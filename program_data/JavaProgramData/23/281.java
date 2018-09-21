package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		int i;
		int j;
		int k;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					a[i][j] = tempVar.charAt(0);
				}
				if ((a[i][j] == ' ') || (a[i][j] == '\n'))
				{
					break;
				}
			}
			if (a[i][j] == ' ')
			{
				a[i][j] = '\0';
			}
			if (a[i][j] == '\n')
			{
				a[i][j] = '\0';
				break;
			}
		}
		k = i;
		for (i = k;i > 0;i--)
		{
			for (j = 0;j <= (String.valueOf(a[i]).length() - 1);j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print(" ");
		}
		for (j = 0;j <= (String.valueOf(a[i]).length() - 1);j++)
		{
		System.out.printf("%c",a[0][j]);
		}
		return 0;
	}
}

