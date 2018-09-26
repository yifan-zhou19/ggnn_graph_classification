package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int e;
	char[][] w = new char[1000][256];
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
		w[i] = tempVar2.charAt(0);
	}
	e = String.valueOf(w[i]).length();
	for (j = 0;j < e;j++)
	{
	if (w[i][j] == 'A')
	{
	System.out.print("T");
	}
	else if (w[i][j] == 'T')
	{
	System.out.print("A");
	}
	else if (w[i][j] == 'C')
	{
	System.out.print("G");
	}
	else
	{
	System.out.print("C");
	}
	}
	System.out.print("\n");
	}
	return 0;
	}

}

