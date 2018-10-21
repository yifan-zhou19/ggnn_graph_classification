package <missing>;

public class GlobalMembers
{
	public static void print_str(tangible.RefObject<String> str, int len)
	{
		for (int i = 0; i < len; i++)
		{
			System.out.print(str.argValue.charAt(i));
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		int n;
		int cur_i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (cur_i < n)
		{
			cur_i++;
			String str = new String(new char[300]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);

			int len = str.length();
			if (str.charAt(len - 2) == 'e' && str.charAt(len - 1) == 'r')
			{
			tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
				print_str(tempRef_str, len - 2);
				str = tempRef_str.argValue;
			}
			else if (str.charAt(len - 2) == 'l' && str.charAt(len - 1) == 'y')
			{
			tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str);
				print_str(tempRef_str2, len - 2);
				str = tempRef_str2.argValue;
			}
			else if (str.charAt(len - 3) == 'i' && str.charAt(len - 2) == 'n' && str.charAt(len - 1) == 'g')
			{
			tangible.RefObject<String> tempRef_str3 = new tangible.RefObject<String>(str);
				print_str(tempRef_str3, len - 3);
				str = tempRef_str3.argValue;
			}
			else
			{
			tangible.RefObject<String> tempRef_str4 = new tangible.RefObject<String>(str);
				print_str(tempRef_str4, len);
				str = tempRef_str4.argValue;
			}
		}

		return 0;
	}
}

