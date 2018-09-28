package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int le;
		int j;
		char[][] a = new char[50][15];
		char[][] b =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
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
			le = String.valueOf(a[i]).length();
			for (j = le-3;j < le;j++)
			{
				if (a[i][le-2] == 'e' && a[i][le-1] == 'r')
				{
					b[i] = String.valueOf(a[i]).substring(0, le-2);
				}


			  if (a[i][le-2] == 'l' && a[i][le-1] == 'y')
			  {
				  b[i] = String.valueOf(a[i]).substring(0, le-2);
			  }

				if (a[i][le-3] == 'i' && a[i][le-2] == 'n' && a[i][le-1] == 'g')
				{
					b[i] = String.valueOf(a[i]).substring(0, le-3);
				}

			}
			System.out.printf("%s\n",b[i]);
		}
	}
}

