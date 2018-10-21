package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int l;
		int j;
		char[][] a = new char[100][20];
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
			l = String.valueOf(a[i]).length();
			if (a[i][l - 1] == 'r')
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l - 3]);
			}
			else if (a[i][l - 1] == 'y')
			{
				for (j = 0;j < l - 3;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l - 3]);
			}
			else if (a[i][l - 1] == 'g')
			{
				for (j = 0;j < l - 4;j++)
				{
					System.out.printf("%c",a[i][j]);
				}
				System.out.printf("%c\n",a[i][l - 4]);
			}
		}
	}

}

