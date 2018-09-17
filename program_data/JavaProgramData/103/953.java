package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1001]);
	public static char x;
	public static int length;
	public static void display(int p)
	{
		if (!str.charAt(p))
		{
			return;
		}
		if (length == 1)
		{
			if (str.charAt(p) >= 'A' && str.charAt(p) <= 'Z')
			{
				x = str.charAt(p);
			}
			else
			{
				x = str.charAt(p) - 32;
			}
		}
		if (str.charAt(p) != str.charAt(p + 1) && Math.abs(str.charAt(p) - str.charAt(p + 1)) != 32)
		{
			System.out.print('(');
			System.out.print(x);
			System.out.print(',');
			System.out.print(length);
			System.out.print(')');
			length = 1;
		}
		else
		{
			length++;
		}
		display(p + 1);
	}
	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = 1;
		display(0);
	}


}

