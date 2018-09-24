package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int j;
		int k;
		int n = 0;
		for ((a[i];i++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
							  n++;
		}
		for (i = 1;i <= n;i++)
		{
						 String b = new String(new char[110]);
						 for (k = 0;k <= 109;k++)
						 {
											b = tangible.StringFunctions.changeCharacter(b, k, ' ');
						 }
						 int[] c = new int[110];
						 int p = 0;
						 int q = 0;
						 int m = 0;
						 for (j = 0;j <= 109;j++)
						 {
											if (a[i][j] != 0)
											{
											m++;
											}
						 }
						 for (j = 0;j <= m - 1;j++)
						 {
											if (a[i][j] == '(')
											{
														 p++;
														 b = tangible.StringFunctions.changeCharacter(b, j, '$');
											}
											else if (a[i][j] == ')')
											{
														 b = tangible.StringFunctions.changeCharacter(b, j, '?');
														 if (p > 0)
														 {
																b = tangible.StringFunctions.changeCharacter(b, j, ' ');
																p--;
																for (k = j - 1;k >= 0;k--)
																{
																				if ((b.charAt(k) == '$') && (c[k] == 0))
																				{
																					break;
																				}
																}
																b = tangible.StringFunctions.changeCharacter(b, k, ' ');
																c[k] = 1;
														 }
											}
						 }
						 System.out.print(a[i]);
						 System.out.print("\n");
						 for (j = 0;j <= m - 2;j++)
						 {
											System.out.print(b.charAt(j));
						 }
						 System.out.print(b.charAt(m - 1));
						 System.out.print("\n");
		}
		return 0;
	}
}

