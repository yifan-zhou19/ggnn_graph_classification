package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String e = new String(new char[1]);
		int i;
		int j;
		int k;
		while (scanf("%s %s",a,b) != EOF)
		{
			e = tangible.StringFunctions.changeCharacter(e, 0, a.charAt(0));
			k = 0;
			for (i = 0;a.charAt(i) != '\0';i++)
			{
				if (a.charAt(i) > e.charAt(0))
				{
					e = tangible.StringFunctions.changeCharacter(e, 0, a.charAt(i));
					k = i;
				}
			}
			for (i = 0;i <= k;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			c = tangible.StringFunctions.changeCharacter(c, i, '\0');
			for (j = k + 1;a.charAt(j) != '\0';j++)
			{
				d = tangible.StringFunctions.changeCharacter(d, j - k - 1, a.charAt(j));
			}
			d = tangible.StringFunctions.changeCharacter(d, j - k - 1, '\0');
			c += b;
			c += d;
			System.out.printf("%s\n",c);
		}
		return 0;
	}





}

