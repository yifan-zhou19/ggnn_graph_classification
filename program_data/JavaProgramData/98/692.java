package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int len;
		int k;
		int m;
		int l;
		int n;
		int f;
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (f = 0;f < n;f++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length();
			for (k = 0;k < len;k++)
			{
				b[i][j++] = a.charAt(k);
			}
			if (j == 79 || j == 80)
			{
				b[i][j] = '\0';
				i++;
				j = 0;
			}
			else if (j > 80)
			{
				for (l = j - 1;;l--)
				{
					if (b[i][l] != ' ')
					{
					b[i][l] = '\0';
					}
					if (b[i][l] == ' ')
					{
						break;
					}
				}
				b[i][l] = '\0';
				j = 0;
				i++;
				for (k = 0;k < len;k++)
				{
					b[i][j++] = a.charAt(k);
				}
				b[i][j++] = ' ';
			}
			else if (j < 79)
			{
				b[i][j++] = ' ';
			}
		}
		b[i][j - 1] = '\0';
		for (m = 0;m <= i;m++)
		{
				System.out.print(b[m]);
				System.out.print("\n");
		}

		return 0;
	}

}

