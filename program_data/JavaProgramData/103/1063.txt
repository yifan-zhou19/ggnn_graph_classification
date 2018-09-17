package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int j;
		int[] b = new int[2000];
		int[] c = new int[2000];
		String a = new String(new char[2000]);
		String s = new String(new char[2000]);
		s = new Scanner(System.in).nextLine();
		m = s.length();
		for (i = 0;i < m;i++)
		{
			if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - ('a'-'A'));
			}
		}
		for (i = 0;i < m;i++)
		{
			if (s.charAt(i) == s.charAt(i + 1))
			{
			c[i] = 1;
			}
		}
		for (i = 0,j = 0;i < m;i++)
		{
			if (c[i] == 0)
			{
				j++;
				b[j] = i + 1;
				a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
			}
		}
		for (j = 0;j < 2000;j++)
		{
			if (b[j] != 0)
			{
			System.out.printf("(%c,%d)",a.charAt(j),b[j] - b[j - 1]);
			}
		}
	}
}

