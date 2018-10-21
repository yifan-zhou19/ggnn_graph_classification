package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] b = new int[50];
		char[][] a = new char[50][33];
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
			if (a[i][b[i] - 1] == 'r')
			{
				a[i][b[i] - 2] = '\0';
			}
			else if (a[i][b[i] - 1] == 'g')
			{
				a[i][b[i] - 3] = '\0';
			}
			else if (a[i][b[i] - 1] == 'y')
			{
				a[i][b[i] - 2] = '\0';
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}

}

