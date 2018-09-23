package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[3]);
		char[][] c = new char[1000][15];
		char t;
		int i;
		int j;
		int k;
		int n = 0;
		int[] a = new int[1000];
		for (i = 0;i < 1000;i++)
		{
			c[i] = new Scanner(System.in).nextLine();
		if (c[i][0] != '\0')
		{
		a[i] = String.valueOf(c[i]).length();
		n++;
		}
		else
		{
			break;
		}
		}
		for (i = 0;i < n;i++)
		{
			t = c[i][0];
		str = tangible.StringFunctions.changeCharacter(str, 1, c[i][a[i] - 3]);
		str = tangible.StringFunctions.changeCharacter(str, 2, c[i][a[i] - 2]);
		str = tangible.StringFunctions.changeCharacter(str, 3, c[i][a[i] - 1]);

		for (j = 0;j < a[i] - 4;j++)
		{
			if (t < c[i][j])
			{
				t = c[i][j];
			}
		}
		for (j = 0;j < a[i] - 4;j++)
		{
			if (t == c[i][j])
			{
			for (k = a[i] - 1;k >= j + 4;k--)
			{
				c[i][k] = c[i][k - 3];
			}
			c[i][a[i] - 1] = '\0';
			c[i][j + 1] = str.charAt(1);
			c[i][j + 2] = str.charAt(2);
			c[i][j + 3] = str.charAt(3);
			break;
			}
		}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",c[i]);
		}
	}

}

