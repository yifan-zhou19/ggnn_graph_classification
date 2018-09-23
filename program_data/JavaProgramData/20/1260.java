package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char[][] substr =
		{
			{0, '\0', '\0', '\0'}
		};
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0'};
		int i = 0;
		int j;
		int k;
		int maxpos;
		while (scanf("%s %s",a,b) != EOF)
		{
			for (j = 0;j <= a.length();j++)
			{
				str[i][j] = a[j];
			}
			for (j = 0;j <= b.length();j++)
			{
				substr[i][j] = b[j];
			}
			i++;
		}
		for (j = 0;j <= i - 1;j++)
		{
			maxpos = String.valueOf(str[j]).length() - 1;
			for (k = String.valueOf(str[j]).length() - 1;k >= 0;k--)
			{
				if (str[j][k] >= str[j][maxpos])
				{
					maxpos = k;
				}
			}
			for (k = 0;k <= maxpos;k++)
			{
				System.out.print(str[j][k]);
			}
			for (k = 0;k <= 2;k++)
			{
				System.out.print(substr[j][k]);
			}
			for (k = maxpos + 1;k <= String.valueOf(str[j]).length() - 1;k++)
			{
				System.out.print(str[j][k]);
			}
			System.out.print('\n');
		}

		return 0;
	}
}
