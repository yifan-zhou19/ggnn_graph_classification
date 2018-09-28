package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int s = 0;
		int[] z = new int[100];
		int y;
		int[] x = new int[100];
		int[] t = new int[100];
		String a = new String(new char[1000]);
		char[][] b = new char[100][100];
		String c = new String(new char[1000]);
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				b[i][j] = '\0';
			}
		}
		for (i = 0;i < 1000;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
		}
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != ',')
			{
				s = s + 1;
				for (j = i;j < n;j++)
				{
					if (a.charAt(j) != ' ' && a.charAt(j) != ',')
					{
						b[s][j - i] = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, ',');
						x[s] = x[s] + 1;
					}
					else
					{
						break;
					}
				}
			}
		}
		y = 1;
		for (i = 1;i < s;i++)
		{
			if (x[i + 1] > x[y])
			{
				y = i + 1;
			}
		}
		System.out.printf("%s\n",b[y]);
		y = 1;
		for (i = 1;i < s;i++)
		{
			if (x[i + 1] < x[y])
			{
				y = i + 1;
			}
		}
		System.out.printf("%s\n",b[y]);
	}
}

