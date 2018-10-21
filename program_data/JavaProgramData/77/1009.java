package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int len;
	public static String str = new String(new char[100]);
	public static char a;
	public static void P(int d)
	{
		while (i < len)
		{
			if (str.charAt(i) == a)
			{
				P(i++);
			}
			else
			{
				System.out.print(d);
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
				i++;
				return;
			}
		}
	}

	public static int Main()
	{
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = str.charAt(0);
		len = str.length();
		P(0);
		return 0;
	}

}

