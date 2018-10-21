package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1000]);
	public static int len;

	public static int operation(int start)
	{
		int i = start;
		int count = 0;
		for (; str.charAt(i) == str.charAt(start); i++)
		{
			count++;
		}
		System.out.print("(");
		System.out.print(str.charAt(start));
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");

		return count;
	}

	public static int Main()
	{
		int i;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		for (i = 0; i < len; i++)
		{
			if (str.charAt(i) > 90)
			{
				str.charAt(i) -= 32;
			}
		}
		for (i = 0; i < len; i++)
		{
			i += operation(i) - 1;
		}
		System.out.print("\n");

		return 0;
	}
}

