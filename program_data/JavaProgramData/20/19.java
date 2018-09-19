package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char mid;
		char[][] a = new char[100][50];
		int i = 0;
		int j = 0;
		int k = 0;
		int m;
		int[] b = new int[100];
		do
		{
			a[i] = new Scanner(System.in).nextLine();
			b[i] = String.valueOf(a[i]).length();
			i++;
		} while (a[i - 1][0] != '\0');

		m = i - 1;

		for (i = 0;i < m;i++)
		{
			k = 0;
			mid = a[i][0];
			for (j = 1;j < b[i] - 4;j++)
			{
				if (a[i][j] > mid)
				{
					mid = a[i][j];
					k = j;
				}
			}
			for (j = 0;j <= k;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			for (j = b[i] - 3;j < b[i];j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			for (j = k + 1;j < b[i] - 4;j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			System.out.print("\n");
		}
	}
}
