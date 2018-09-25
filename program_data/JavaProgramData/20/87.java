package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[100][50];
		int[][] b = new int[100][2];
		int[] len = new int[100];
		int[] ben = new int[100];
		int i;
		int j;
		int k;
		k = -1;
		for (i = 0;i < 100;i++)
		{
			ben[i] = 0;
			len[i] = 0;
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
			ben[i] = String.valueOf(str[i]).length();
			for (j = 0;j < ben[i];j++)
			{
				if (str[i][j] == ' ')
				{
					len[i] = j;
				}
			}
		}

		for (i = 0;i < k;i++)
		{
			b[i][1] = str[i][0];
		b[i][0] = 0;
		}
		for (i = 0;i < k;i++)
		{
		for (j = 0;j < len[i];j++)
		{
		if (str[i][j] > b[i][1])
		{
			b[i][0] = j;
			b[i][1] = str[i][j];
		}
		}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (j = 0;j < b[i][0] + 1;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			for (j = len[i] + 1;j < len[i] + 4;j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			for (j = b[i][0] + 1;j < len[i];j++)
			{
				System.out.printf("%c",str[i][j]);
			}
		System.out.print("\n");
		}

		for (j = 0;j < b[k - 1][0] + 1;j++)
		{
				System.out.printf("%c",str[k - 1][j]);
		}
			for (j = len[k - 1] + 1;j < len[k - 1] + 4;j++)
			{
				System.out.printf("%c",str[k - 1][j]);
			}
			for (j = b[k - 1][0] + 1;j < len[k - 1];j++)
			{
				System.out.printf("%c",str[k - 1][j]);
			}
	}
}
