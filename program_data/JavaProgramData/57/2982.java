package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] str = new char[50][100];
	int m;
	int n;
	int i;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		str[i] = tempVar2.charAt(0);
	}
	}
	for (i = 0;i < m;i++)
	{
	n = String.valueOf(str[i]).length();
	if (str[i][n - 1] == 'g')
	{
	for (j = 0;j < n - 3;j++)
	{
	System.out.printf("%c",str[i][j]);
	}
	}
	if (str[i][n - 1] == 'r' || str[i][n - 1] == 'y')
	{
	for (j = 0;j < n - 2;j++)
	{
	System.out.printf("%c",str[i][j]);
	}
	}
	System.out.print("\n");
	}
	}

}

