package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int q;
	char[][] a = new char[1000][256];
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
	for (q = 0;a[i][q] != '\0';q++)
	{
	if (a[i][q] == 'A')
	{
		a[i][q] = 'T';
	}
	else if (a[i][q] == 'T')
	{
	a[i][q] = 'A';
	}
	else if (a[i][q] == 'C')
	{
	a[i][q] = 'G';
	}
	else
	{
	a[i][q] = 'C';

	}

	}
	System.out.printf("%s",a[i]);
	System.out.print("\n");
	}
	return 0;

	}
}

