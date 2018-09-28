package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] a = new char[1000][10];
	int j;
	int m = 0;
	int i;
	int l;
	while (scanf("%s",a[m]) != EOF)
	{
	m++;
	}
	for (i = m - 1;i > 0;i--)
	{
	l = String.valueOf(a[i]).length();
	for (j = 0;j < l;j++)
	{
	System.out.printf("%c",a[i][j]);
	}
	System.out.print(" ");
	}
	l = String.valueOf(a[0]).length();
	for (j = 0;j < l;j++)
	{
	System.out.printf("%c",a[0][j]);
	}
	}
}
