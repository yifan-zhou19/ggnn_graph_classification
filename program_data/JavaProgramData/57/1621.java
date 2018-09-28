package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int x;
		char[][] a = new char[100][20];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			x = 0;


			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}


			x = String.valueOf(a[i]).length();
			if (a[i][x - 2] == 'n')
			{
				a[i][x - 3] = '\0';
				a[i][x - 2] = '\0';
				a[i][x - 1] = '\0';
			}
			else
			{
				a[i][x - 2] = '\0';
				a[i][x - 1] = '\0';

			}

		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}


}

