package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int p;
	int w = 0;
	char[][] a = new char[100][100];
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
	p = String.valueOf(a[i]).length();
	w = 0;
	for (j = 0;j <= p - 1;j++)
	{
	if (j == 0 && a[i][j] <= '9' && a[i][j] >= '0')
	{
		System.out.print("no");
		w = 1;
		break;
	}
	if ((a[i][j] <= '9' && a[i][j] >= '0') || (a[i][j] <= 'Z' && a[i][j] >= 'A') || (a[i][j] <= 'z' && a[i][j] >= 'a') || a[i][j] == '_')
	{

	}
	else
	{
		System.out.print("no");
		w = 1;
		break;
	}

	}
	if (w != 1)
	{
		System.out.print("yes");
	}
	if (i != n)
	{
		System.out.print("\n");
	}
	}
	}
}

