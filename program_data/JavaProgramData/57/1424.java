package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int n;
		int[] l = new int[101];
		char[][] s = new char[101][101];
		int m;
		int a;
		int b;
		int c;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m <= n - 1;m++)
		{
			s[m] = new Scanner(System.in).nextLine();
			l[m] = String.valueOf(s[m]).length();
		}
		for (m = 0;m <= n - 1;m++)
		{
			a = l[m] - 3;
			b = l[m] - 2;
			c = l[m] - 1;
			if (s[m][a] == 105 && s[m][b] == 110 && s[m][c] == 103)
			{
				for (r = 0;r <= l[m] - 5;r++)
				{
				System.out.printf("%c",s[m][r]);
				}
				System.out.printf("%c\n",s[m][a - 1]);
			}
			if (s[m][b] == 101 && s[m][c] == 114)
			{
				for (r = 0;r <= l[m] - 4;r++)
				{
				System.out.printf("%c",s[m][r]);
				}
				System.out.printf("%c\n",s[m][a]);
			}
			if (s[m][b] == 108 && s[m][c] == 121)
			{
				for (r = 0;r <= l[m] - 4;r++)
				{
				System.out.printf("%c",s[m][r]);
				}
				System.out.printf("%c\n",s[m][a]);
			}
		}
	}
}

