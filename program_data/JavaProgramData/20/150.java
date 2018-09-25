package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		char[][] str = new char[100][100];
		int a;
		int b;
		int e;
		int i = 0;
		int j;
		while (gets(str[i]) != 0)
		{
			c = 0;
			for (j = 0;str[i][j] != ' ';j++)
			{
				if (str[i][j] > c)
				{
					c = str[i][j];
					a = j;
				}
			}
			e = j;
			b = String.valueOf(str[i]).length();
			for (j = 0;j <= a;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			for (j = e+1;j <= b - 1;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			for (j = a + 1;j <= e-1;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			System.out.print("\n");
			i++;
		}
	}
}
