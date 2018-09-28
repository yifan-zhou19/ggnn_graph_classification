package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] a = new char[n][256];
	char[][] b = new char[n][256];

	int i;
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i - 1] = tempVar2.charAt(0);
	}
	int x = 1;
	int t;
	for (t = 1;t != 0;x++)
	{
	if (a[i - 1][x - 1] == 65)
	{
		b[i - 1][x - 1] = 84;
	}
	if (a[i - 1][x - 1] == 84)
	{
		b[i - 1][x - 1] = 65;
	}
	if (a[i - 1][x - 1] == 67)
	{
		b[i - 1][x - 1] = 71;
	}
	if (a[i - 1][x - 1] == 71)
	{
		b[i - 1][x - 1] = 67;
	}
	if (a[i - 1][x - 1] == 0)
	{
		t = 0;
	}
	}

	}

	for (int i = 1;i < n;i++)
	{
		System.out.printf("%s\n",b[i - 1]);
	}
	System.out.printf("%s",b[n - 1]);
	return 0;
	}


}

