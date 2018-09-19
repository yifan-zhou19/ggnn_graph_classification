package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][13];
		char temp;
		int i;
		int n;
		int k;
		int len;
		int j;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 13;j++)
			{
				c[i][j] = '\0';
			}
		}
		for (i = 0;;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
			if (c[i][0] == 0)
			{
				break;
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			len = String.valueOf(c[i]).length();
			temp = c[i][0];
			k = 0;
			for (j = 0;j <= len - 5;j++)
			{
				if (c[i][j] > temp)
				{
					temp = c[i][j];
					k = j;
				}
			}
			for (j = 0;j <= k;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			for (j = len - 3;j < len;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			for (j = k + 1;j < len - 4;j++)
			{
				System.out.printf("%c",c[i][j]);
			}
			System.out.print("\n");
		}
	}

}
