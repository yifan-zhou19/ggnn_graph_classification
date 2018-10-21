package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
	int i = 0;
	while (scanf("%s",a[i]) != EOF)
	{
		i++;
	}
	i--;
	System.out.print(a[i]);
	i--;

	for (;i >= 0;i--)
	{
	System.out.print(" ");
	System.out.print(a[i]);
	}
	return 0;
	}
}
