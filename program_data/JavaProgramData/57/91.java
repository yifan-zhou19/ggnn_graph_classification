package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][50];
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
		a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n + 1;i++)
		{
			if (a[i][String.valueOf(a[i]).length() - 2] == 'l' && a[i][String.valueOf(a[i]).length() - 1] == 'y')
			{
				a[i][String.valueOf(a[i]).length() - 1] = 0;
				a[i][String.valueOf(a[i]).length() - 1] = 0;
			}
			else if (a[i][String.valueOf(a[i]).length() - 2] == 'e' && a[i][String.valueOf(a[i]).length() - 1] == 'r')
			{
				a[i][String.valueOf(a[i]).length() - 1] = 0;
				a[i][String.valueOf(a[i]).length() - 1] = 0;
			}
			else if (a[i][String.valueOf(a[i]).length() - 2] == 'n' && a[i][String.valueOf(a[i]).length() - 1] == 'g' && a[i][String.valueOf(a[i]).length() - 3] == 'i')
			{
				a[i][String.valueOf(a[i]).length() - 1] = 0;
				a[i][String.valueOf(a[i]).length() - 1] = 0;
				a[i][String.valueOf(a[i]).length() - 1] = 0;
			}
		}

			for (i = 0;i < n + 1;i++)
			{
		System.out.printf("%s\n",a[i]);
			}

	}


}

