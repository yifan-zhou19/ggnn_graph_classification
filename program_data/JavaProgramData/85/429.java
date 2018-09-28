package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int k;
	int n;
	int q;
	int w;
	char[][] a = new char[100][21];
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
	}
	for (i = 0;i < n;i++)
	{
	q = String.valueOf(a[i]).length();
	w = 0;
	for (k = 0;k < q;k++)
	{
	if (k == 0 && (a[i][k] == 95 || (a[i][k] >= 97 && a[i][k] <= 122) || (a[i][k] >= 65 && a[i][k] <= 90)))
	{
		w++;
	}
	if (k != 0 && (a[i][k] == 95 || (a[i][k] >= 97 && a[i][k] <= 122) || (a[i][k] >= 48 && a[i][k] <= 57) || (a[i][k] >= 65 && a[i][k] <= 90)))
	{
		w++;
	}
	}
	if (w == q)
	{
		System.out.print("yes\n");
	}
	else
	{
		System.out.print("no\n");
	}
	}
	return 0;
	}
}

