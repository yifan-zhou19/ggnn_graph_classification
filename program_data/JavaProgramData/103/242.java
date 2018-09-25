package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		int r;
		String s = new String(new char[1100]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		m = s.length();
		i = 0;
		while (i < m)
		{
			j = i;
			l = (int)s.charAt(i);
			r = (int)s.charAt(j);
			while (l == r || (l - 32) == r || (l + 32) == r)
			{
				j++;
				r = (int)s.charAt(j);
			}
			System.out.print("(");
			if (l < 97)
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				System.out.print((char)(l - 32));
			}
			System.out.print(",");
			System.out.print(j - i);
			System.out.print(")");
			i = j;
		}
		System.out.print("\n");

		return 0;
	}


}

