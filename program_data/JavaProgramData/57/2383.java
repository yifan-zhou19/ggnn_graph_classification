package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		char[][] a = new char[88][88];
		char[][] c =
		{
			{'a', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] b = new int[88];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		b[i] = String.valueOf(a[i]).length();
		if (a[i][b[i] - 1] == 'r')
		{
			c[i] = String.valueOf(a[i]).substring(0, b[i] - 2);
		}
		if (a[i][b[i] - 1] == 'g')
		{
			c[i] = String.valueOf(a[i]).substring(0, b[i] - 3);
		}
		if (a[i][b[i] - 1] == 'y')
		{
			c[i] = String.valueOf(a[i]).substring(0, b[i] - 2);
		}
		}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%s\n",c[i]);
	}

	}



}

