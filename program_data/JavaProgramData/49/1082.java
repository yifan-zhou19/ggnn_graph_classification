package <missing>;

public class GlobalMembers
{
	public static int isgoodsubstr(tangible.RefObject<String> s, int l, int r)
	{
		if (l > r)
		{
			return -1; //wrong!
		}
		int i = l;
		int j = r;
		for (; i < j; i++, j--)
		{
			if (s.argValue.charAt(i) != s.argValue.charAt(j))
			{
				return 0;
			}
		}
		return 1;
	}

	public static int Main()
	{
		String s = new String(new char[501]);
		s = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		int l = s.length();
		int k = 0;
		for (i = 2; i <= l; i++)
		{
			for (j = 0; j + i - 1 < l; j++)
			{
			tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
				if (isgoodsubstr(tempRef_s, j, j + i - 1) == 1)
				{
					s = tempRef_s.argValue;
					for (k = j; k <= j + i - 1; k++)
					{
						System.out.print(s.charAt(k));
					}
					System.out.print('\n');
				}
				else
				{
					s = tempRef_s.argValue;
				}
			}
		}
		return 0;
	}
}

