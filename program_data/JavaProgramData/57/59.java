package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[60][20];
		int n;
		int i;
		int[] b = new int[60];
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
			b[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][b[i] - 1] == 'g' && a[i][b[i] - 2] == 'n' && a[i][b[i] - 3] == 'i')
			{
				a[i][b[i] - 1] = '\0';
				a[i][b[i] - 2] = '\0';
				a[i][b[i] - 3] = '\0';
				continue;
			}
			if (a[i][b[i] - 1] == 'y' && a[i][b[i] - 2] == 'l' || a[i][b[i] - 1] == 'r' && a[i][b[i] - 2] == 'e')
			{
				a[i][b[i] - 1] = '\0';
				a[i][b[i] - 2] = '\0';
				continue;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
	}
}

