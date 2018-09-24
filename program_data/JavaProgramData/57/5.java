package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	char[][] c = new char[50][100];
	int n;
	int i;
	int j;
	int k;
	int b;
	int[] a = new int[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,k = 0;i <= n;i++,k++)
	{
	for (j = 0;;j++)
	{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c[i][j] = tempVar2.charAt(0);
		}
		if (c[i][j] == '\n')
		{
			break;
		}
		a[k] = j + 1;
	}
	}
	for (i = 1;i < n;i++)
	{
		b = a[i];
		if (c[i][b - 2] == 'e' && c[i][b - 1] == 'r' || c[i][b - 2] == 'l' && c[i][b - 1] == 'y')
		{
			for (j = 0;j < b - 2;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		if (c[i][b - 3] == 'i' && c[i][b - 2] == 'n' && c[i][b - 1] == 'g')
		{
			for (j = 0;j < b - 3;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
		}
		System.out.print("\n");
	}
	b = a[i];
	if (c[i][b - 2] == 'e' && c[i][b - 1] == 'r' || c[i][b - 2] == 'l' && c[i][b - 1] == 'y')
	{
		for (j = 0;j < b - 2;j++)
		{
			System.out.printf("%c",c[i][j]);
		}
	}
	if (c[i][b - 3] == 'i' && c[i][b - 2] == 'n' && c[i][b - 1] == 'g')
	{
		for (j = 0;j < b - 3;j++)
		{
			System.out.printf("%c",c[i][j]);
		}
	}
	}
}

