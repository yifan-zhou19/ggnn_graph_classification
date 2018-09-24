package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int n;
		int x;
		int y;
		int z = 0;
		char[][] str = new char[100][12];
		char[][] substr = new char[100][5];
		while (scanf("%s%s", str[i], substr[i]) != EOF)
		{
			n = String.valueOf(str[i]).length();
			for (j = 0;j < n;j++)
			{
				z = 0;
				for (k = 0;k < n;k++)
				{
					if (str[i][j] >= str[i][k])
					{
						z++;
					}
				}
					if (z == n)
					{
						break;
					}

			}
			for (y = 0;y <= j;y++)
			{
				System.out.printf("%c",str[i][y]);
			}
			System.out.printf("%s",substr[i]);
			for (y = j + 1;y < n;y++)
			{
				System.out.printf("%c",str[i][y]);
			}
			System.out.print("\n");



			i++;
		}






	}
}
