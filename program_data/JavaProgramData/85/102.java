package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] a = new char[20][20];
	int n;
	int i;
	int j;
	int b = 1;
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
	for (j = 0;a[i][j] != '\0';j++)
	{
		b = 1;
	if (a[i][0] <= '9' && a[i][0] >= '0')
	{
	b = 0;
	break;
	}
	else if ((a[i][j] <= '9' && a[i][j] >= '0') || (a[i][j] <= 'Z' && a[i][j] >= 'A') || (a[i][j] <= 'z' && a[i][j] >= 'a') || a[i][j] == '_')
	{
	b = b;
	}
	else
	{
		b = 0;
		break;
	}
	}
	System.out.print(b == 0?"no\n":"yes\n");
	}
	return 0;
	}
}

