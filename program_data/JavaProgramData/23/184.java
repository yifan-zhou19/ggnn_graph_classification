package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] a = new char[20][20];
	int i = 0;
	int j;
	while (scanf("%s",a[i]) != EOF)
	{
	i++;
	}
	System.out.printf("%s",a[i - 1]);
	for (j = i - 2;j >= 0;j--)
	{
	System.out.printf(" %s",a[j]);
	}





	}
}
