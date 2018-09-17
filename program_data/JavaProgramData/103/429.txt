package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		int len;
		int count = 0;
		int i;
		char c;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str.charAt(i) -= 32;
			}
		}
		c = str.charAt(0);
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == c)
			{
				count++;
			}
			else
			{
				System.out.print("(");
				System.out.print(str.charAt(i - 1));
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				c = str.charAt(i);
				count = 1;
			}
		}
		i--;
		System.out.print("(");
		System.out.print(str.charAt(i));
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		System.out.print("\n");

		return 0;
	}
}

