package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		char[][] a = new char[50][40];
		String b = new String(new char[50]);
		while (scanf("%s",b) != EOF)
		{
			a[i] = b;
			i++;
		}
		int j;
		System.out.printf("%s",a[i - 1]);
		for (j = i - 2;j >= 0;j--)
		{
			System.out.printf(" %s",a[j]);
		}
	}
}
