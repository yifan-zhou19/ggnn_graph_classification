package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][50];
		int[][] a = new int[100][2];
		int[] b = new int[100];
		int[] c = new int[100];
		int i;
		int j;
		int k = -1;
		for (i = 0;i < 100;i++)
		{
			c[i] = b[i] = 0;
		}
		for (i = 0;i < 100;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
		k = k + 1;
		if (str[i][0] == '\0')
		{
			break;
		}
		}
		for (i = 0;i < k;i++)
		{
			c[i] = String.valueOf(str[i]).length();
		for (j = 0;j < c[i];j++)
		{
		if (str[i][j] == ' ')
		{
			b[i] = j;
		}
		}
		}

		for (i = 0;i < k;i++)
		{
			a[i][1] = str[i][0];
		a[i][0] = 0;
		}
		for (i = 0;i < k;i++)
		{
		for (j = 0;j < b[i];j++)
		{
		if (str[i][j] > a[i][1])
		{
			a[i][0] = j;
		a[i][1] = str[i][j];
		}
		}
		}

		for (i = 0;i < k;i++)
		{
			for (j = 0;j < a[i][0] + 1;j++)
			{
			System.out.printf("%c",str[i][j]);
			}
		for (j = b[i] + 1;j < b[i] + 4;j++)
		{
			System.out.printf("%c",str[i][j]);
		}
			 for (j = a[i][0] + 1;j < b[i];j++)
			 {
			System.out.printf("%c",str[i][j]);
			 }
		System.out.print("\n");
		}

	}

}
