package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][100];
		int i = 0;
		int j;
		int count;
		int max;
		int m;
		int[] b = new int[100];
		do
		{
			c[i] = new Scanner(System.in).nextLine();
			b[i] = String.valueOf(c[i]).length();
			i++;
		} while (c[i - 1][0] != '\0');
		m = i - 1;
		for (i = 0;i < m;i++)
		{
			max = 0;
			count = 0;
			for (j = 0;j < b[i] - 4;j++)
			{
				if (c[i][j] > max)
				{
					max = c[i][j];
					count = j;
				}
			}
			for (j = 0;j <= count;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			for (j = b[i] - 3;j <= b[i] - 1;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			for (j = count + 1;j < b[i] - 4;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.print("\n");
		}
	}






}
