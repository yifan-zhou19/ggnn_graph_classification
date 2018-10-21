package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][20];
		int i = 0;
		int len;
		while (scanf("%s",a[i]) != EOF)
		{
			i++;
		}
		i--;
		System.out.printf("%s",a[i]);
		i--;
		for (;i >= 0;i--)
		{
			System.out.printf(" %s",a[i]);
		}
	}
}
