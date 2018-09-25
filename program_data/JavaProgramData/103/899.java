package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1001]);
		int i;
		int len;
		int count;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str.charAt(i) -= 32;
			}
		}
		i = 0;
		while (i < len)
		{
			count = 1;
			while (str.charAt(i + 1) == str.charAt(i) && i < len)
			{
				i++;
				count++;
			}
			System.out.print("(");
			System.out.print(str.charAt(i));
			System.out.print(",");
			System.out.print(count);
			System.out.print(")");
			i++;
		}
		return 0;
	}
}

