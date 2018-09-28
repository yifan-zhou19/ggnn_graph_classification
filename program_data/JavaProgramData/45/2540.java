package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		String s = new String(new char[60]);
		String w = new String(new char[60]);
		int i = 0;
		int n;
		int m;
		int j;
		while (true)
		{
			c = System.in.read();
			if (c != ' ')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, c);
			}
			else
			{
				break;
			}
			i++;
		}
		n = i;
		w = new Scanner(System.in).nextLine();
		m = w.length();
		for (i = 0;;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (s.charAt(j) != w.charAt(j + i))
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}
}

