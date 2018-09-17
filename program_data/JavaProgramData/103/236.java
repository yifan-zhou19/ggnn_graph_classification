package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[2000]);

		s = ConsoleInput.readToWhiteSpace(true).charAt(0);

	int p = 0;

	while (s.charAt(p) != 0)
	{

		int sum = 1;
		char c = s.charAt(p);

		while ((s.charAt(p + 1) - s.charAt(p) == 0) || (s.charAt(p + 1) - s.charAt(p)) == 'A'-'a' || (s.charAt(p + 1) - s.charAt(p)) == 'a'-'A')
		{
			sum++;
			p++;
		}

		char out;

		if (c >= 'a')
		{
			out = (char)(c - 'a'+'A');
		}
		else
		{
			out = c;
		}

		System.out.print('(');
		System.out.print(out);
		System.out.print(',');
		System.out.print(sum);
		System.out.print(')');

		p++;

	}

		return 0;

	}
}

