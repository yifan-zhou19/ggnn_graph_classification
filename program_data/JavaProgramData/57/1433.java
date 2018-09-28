package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		char[][] a = new char[50][100];
		char b;
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
			b = String.valueOf(a[i]).length() - 1;
			if (a[i][b] == 'r' || a[i][b] == 'y')
			{
				a[i][b - 1] = '\0';
			}
			if (a[i][b] == 'g')
			{
				a[i][b - 2] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}

}

