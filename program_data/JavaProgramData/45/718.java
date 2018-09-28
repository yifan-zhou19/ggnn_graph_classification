package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		String c = new String(new char[100]);
		int i = 0;
		int j;
		int q;
		int lena;
		int lenb;
		int w = 0;
			c = new Scanner(System.in).nextLine();
		while (c.charAt(i) != ' ')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i));
			i++;
		}
		for (j = 1 + i;j < c.length();j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j - 1 - i, c.charAt(j));
		}
		lenb = b.length();
		lena = a.length();
		for (i = 0;i < lenb;i++)
		{
			if (b.charAt(i) != a.charAt(0))
			{
				continue;
			}
			else
			{
				q = i;
				for (j = i;j < i + lena;j++)
				{
					if (b.charAt(j) == a.charAt(j - q))
					{
						w = w + 1;
					}
				}
				if (w == lena)
				{
					System.out.printf("%d",q);
				}
			}
		}
		return 0;
	}

}

