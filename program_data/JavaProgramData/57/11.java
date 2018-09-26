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
	int i;
	int k;
	char[][] a = new char[100][100];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = tempVar2.charAt(0);
	}
	}
	int[] c = new int[100];
	for (i = 0;i < n;i++)
	{
	c[i] = String.valueOf(a[i]).length();
	}
	for (i = 0;i < n;i++)
	{
	if (a[i][c[i] - 1] == 'g')
	{
		a[i][c[i] - 3] = '\0';
	a[i][c[i] - 2] = '\0';
	a[i][c[i] - 1] = '\0';
	}
	else
	{
	a[i][c[i] - 2] = '\0';
	a[i][c[i] - 1] = '\0';
	}
	}
	for (i = 0;i < n;i++)
	{
		System.out.println(a[i]);
	System.out.print("\n");
	}
	}

}

