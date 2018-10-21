package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		final String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int num;
		int i = 0;
		int l;
		int m;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = str.length();
		while (i < l)
		{
			num = 1;
			while (str.charAt(i + 1) == str.charAt(i) || str.charAt(i + 1) == str.charAt(i) + 32 || str.charAt(i + 1) == str.charAt(i) - 32)
			{
				i++;
				num++;
			}
			if (str.charAt(i) - '0' <= 'Z'-'0')
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
			}
			else
			{
				m = 'A'-'a' + str.charAt(i) - 65;
				System.out.print("(");
				System.out.print(s.charAt(m));
				System.out.print(",");
				System.out.print(num);
				System.out.print(")");
			}
			i++;
		}

		return 0;
	}
}

