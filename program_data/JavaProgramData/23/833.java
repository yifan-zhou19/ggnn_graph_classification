package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int len;
		int word = 1;
		String a = new String(new char[100]);
		char[][] b = new char[50][20];
		for (i = 0;i < 50;i++)
		{
			for (j = 0;j < 20;j++)
			{
				b[i][j] = '!';
			}
		}
		fgets(a,100,stdin);
		len = a.length() - 1;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				word++;
			}
			else
			{
				;
			}
		}
		j = 0;
		k = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				b[word - 1 - j][k] = a.charAt(i);
				k++;
			}
			else
			{
				j++;
				k = 0;
			}
		}

		for (i = 0;i <= word;i++)
		{
			for (j = 0;b[i][j] != '!';j++)
			{
				System.out.printf("%c",b[i][j]);
			}
			if (i < word - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}
