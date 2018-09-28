package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
	int k = 0;
		char[][] a = new char[100][100];
	while (cin.getline(a[i],101,' '))
	{
		i++;
	}
	for (k = 0;k < 100;k++)
	{
		if (a[i - 1][k] == '\0')
		{
	a[i - 1][k - 1] = '\0';
		}
	}
	int j = 0;
	for (j = 0;j < i - 1;j++)
	{
		System.out.print(a[i - j - 1]);
		System.out.print(' ');
	}
						System.out.print(a[0]);
	 return 0;
	}
}
