package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[300];
		int num = 0;
		int i = 0;
	char[][] a = new char[300][100];
	while (scanf("%s",a[i]) != EOF)
	{
		b[i] = String.valueOf(a[i]).length();
	i = i + 1;
	}
	for (n = 0;n <= i - 1;n++)
	{
		if (n == 0)
		{
	System.out.printf("%d",b[n]);
		}
	else
	{
	System.out.printf(",%d",b[n]);
	}
	}

	   return 0;
	}

}
