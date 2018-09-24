package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
	char[][] a = new char[100][50];
	char[][] b = new char[100][50];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
	m = String.valueOf(a[i]).length();
	if (a[i][m - 1] == 'r' || a[i][m - 1] == 'y')
	{
	a[i][m - 2] = '\0';
	}
	if (a[i][m - 1] == 'g')
	{
	a[i][m - 3] = '\0';
	}
	}
	for (i = 1;i <= n;i++)
	{
	System.out.printf("%s\n",a[i]);
	}
	}


}

