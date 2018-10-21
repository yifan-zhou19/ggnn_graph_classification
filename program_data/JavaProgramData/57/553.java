package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int d;
	int k;
	char[][] a = new char[100][100];
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
		j = String.valueOf(a[i]).length();

		if (a[i][j - 1] == 'g')
		{
			for (k = 0;k < j - 3;k++)
			{
				System.out.printf("%c",a[i][k]);
			}
			 System.out.print("\n");
		}
		else
		{
				   for (k = 0;k < j - 2;k++)
				   {
				System.out.printf("%c",a[i][k]);
				   }
			 System.out.print("\n");
		}
	}
	}
}

