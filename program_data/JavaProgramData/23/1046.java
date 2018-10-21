package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][101];
		String temp = new String(new char[101]);
		int c = 0;
		while (scanf("%s",a[c]) != EOF)
		{
		c++;
		}
		for (int i = c - 1;i > 0;i--)
		{
	System.out.printf("%s ",a[i]);
		}
	System.out.printf("%s",a[0]);
	}
}
