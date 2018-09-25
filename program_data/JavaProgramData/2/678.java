package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String author = new String(new char[27]);
		int i;
		int j;
		int n;
		int no;
		int[][] ab = new int[26][1000];
		int[] an = new int[26];
		int ma = 0;
		int na;
		int am;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--)
		{
			no = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			author = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i < 27;i++)
			{
				if (author.charAt(i) != '\0')
				{
					ab[author.charAt(i) - 'A'][an[author.charAt(i) - 'A']] = no,an[author.charAt(i) - 'A']++;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			na = 0;
			for (j = 0;j < 999;j++)
			{
				if (ab[i][j] != 0)
				{
					na++;
				}
				else
				{
					break;
				}
			}
			if (na > ma)
			{
				ma = na,am = i;
			}
		}
		System.out.print((char)('A' + am));
		System.out.print("\n");
		System.out.print(ma);
		System.out.print("\n");
		for (i = 0;i < 1000;i++)
		{
			if (ab[am][i] != 0)
			{
				System.out.print(ab[am][i]);
				System.out.print("\n");
			}
			else
			{
				break;
			}
		}
		return 0;
	}


}

