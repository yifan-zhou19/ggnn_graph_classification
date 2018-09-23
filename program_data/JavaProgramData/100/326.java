package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		String c = new String(new char[300]);
		char p;
		int i;
		int j;
		int t;
		int f = 0;
		int m;
		int[] a = new int[300];
		str = new Scanner(System.in).nextLine();
		m = str.length();
		for (i = 0;i <= (m - 1);i++)
		{
			if (str.charAt(i) <= 122 && str.charAt(i) >= 97)
			{

				t = 1;
				for (j = i + 1;j <= (m - 1);j++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						t++;
					str = tangible.StringFunctions.changeCharacter(str, j, '}');
					} //'}'=125??????????????????

				}
				a[i] = t;

			}
			else
			{
				f++;
				a[i] = 0;
				str = tangible.StringFunctions.changeCharacter(str, i, '}');
			}
		}


		if (f == m)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i <= m - 1;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, str.charAt(i));
			}
		}
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (c.charAt(i) > c.charAt(i + 1))
				{
					p = c.charAt(i);
					c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i + 1));
					c = tangible.StringFunctions.changeCharacter(c, i + 1, p);
				}
			}
		}
			for (j = 0;j <= m - 1;j++)
			{
				for (i = 0;i <= m - 1;i++)
				{
					if (str.charAt(i) <= 122 && str.charAt(i) >= 97 && c.charAt(j) == str.charAt(i))
					{
						System.out.printf("%c=%d\n",str.charAt(i),a[i]);
					}

				}
			}


	}
}

