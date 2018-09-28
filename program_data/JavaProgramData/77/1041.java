package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[222]);
		int i = 1;
		int j;
		int k;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		char a;
		char b;
		a = s.charAt(0);
		b = s.charAt(len - 1);
		for (i;i <= len - 1;i++)
		{
			k = i;
			if (s.charAt(k) == b)
			{
				j = i;
				for (i = j - 1;i >= 0;i--)
				{
					if (s.charAt(i) == a)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '0');
						s = tangible.StringFunctions.changeCharacter(s, j, '0');
						System.out.printf("%d %d\n",i,j);
						break;
					}
				}
			}
		}
	}
}

