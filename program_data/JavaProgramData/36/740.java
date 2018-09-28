package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k = 0;
		int m = 0;
		int x;
		String a = new String(new char[10000]);
		char t;
		a = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != ' ';)
		{
		i++;
		}
			for (j = i + 1;a.charAt(j) != '\0';)
			{
				j++;
			}
			if (j == 2 * i + 1)
			{
				j = i + 1;
				while (j < 2 * i + 1)
				{
					for (k = j - i - 1,x = 0;k < i;k++)
					{
						if (a.charAt(j) == a.charAt(k))
						{
							t = a.charAt(k);
							a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(j - i - 1));
							a = tangible.StringFunctions.changeCharacter(a, j - i - 1, t);
							m++;
							j++;
							x = 0;
						}
						else
						{
							x++;
						}
					}
						if (x == 2 * i + 1 - j)
						{
							j++;
						}
				}

			}
			if (m == i)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
	}

}

