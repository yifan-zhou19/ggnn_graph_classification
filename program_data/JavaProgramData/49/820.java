package <missing>;

public class GlobalMembers
{
	public static int ju(String str, int j, int k)
	{
		int p;
		int m = 1;
		for (p = k;p <= k + j - 1;p++)
		{
			if (!str[p].equals(str[2 * k + j - 1 - p]))
			{
				m = 0;
			}
		}
		return m;
	}
	public static void Main()
	{
		String str = new String(new char[501]);
		char c;
		int i = 1;
		int j;
		int k;
		int l;
		while ((c = System.in.read()) != '\n')
		{
			str = tangible.StringFunctions.changeCharacter(str, i, c);
			i++;
		}
		i--;
		for (j = 2;j <= i;j++)
		{
			for (k = 1;k <= i - 1;k++)
			{
				if (ju(str, j, k) == 1)
				{
					for (l = k;l <= k + j - 1;l++)
					{
						System.out.printf("%c",str.charAt(l));
					}
					System.out.print("\n");
				}
			}
		}
	}
}

