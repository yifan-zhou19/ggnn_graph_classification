package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String t = new String(new char[3]);
		char asc = '\0';
		char c;
		char[][] m = new char[100][14];
		int i;
		int j;
		int k = 0;
		int count = 0;
		int sn;
		c = System.in.read();

		while (c != EOF)
		{
			s = tangible.StringFunctions.changeCharacter(s, 0, c);
			c = System.in.read();
			for (i = 1;c != ' ';i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, c);
				c = System.in.read();
			}
			sn = i - 1;
			for (i = 0;i < 3;i++)
			{
				c = System.in.read();
				t = tangible.StringFunctions.changeCharacter(t, i, c);
			}
			for (i = 0;i <= sn;i++)
			{
				if (s.charAt(i) > asc)
				{
					asc = s.charAt(i);
					count = i;
				}
			}
			for (j = sn;j > count;j--)
			{
				s = tangible.StringFunctions.changeCharacter(s, j + 3, s.charAt(j));
			}
			sn += 3;
			for (i = 0,j = count;i < 3;i++,j++)
			{
				s = tangible.StringFunctions.changeCharacter(s, j + 1, t.charAt(i));
			}
			asc = 0;
			count = 0;
			s = tangible.StringFunctions.changeCharacter(s, sn + 1, '\0');
			m[k++] = s;
			c = System.in.read();
			c = System.in.read();
		}
		for (i = 0;i < k;i++)
		{
			System.out.println(m[i]);
		}
	}

}

