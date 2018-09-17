package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		char a = '0';
		String s = new String(new char[1000]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = s.length();
		for (i = 0; i < n; i++)
		{
			if (s.charAt(i) == a || (s.charAt(i) - 32 == a))
			{
				k++;
			}
			else
			{
				if (k != 0)
				{
					System.out.print("(");
					System.out.print(a);
					System.out.print(",");
					System.out.print(k);
					System.out.print(")");
				}
				k = 1;
				a = s.charAt(i);
				if (a > 'Z')
				{
					a = a - 32;
				}
			}
		}
		System.out.print("(");
		System.out.print(a);
		System.out.print(",");
		System.out.print(k);
		System.out.print(")");
		return 0;
	}
}

