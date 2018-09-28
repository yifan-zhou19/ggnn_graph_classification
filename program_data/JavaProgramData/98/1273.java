package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int length = 0;
		for (int i = 0;i < n;i++)
		{
			String str = new String(new char[40]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (length == 0)
			{
				System.out.print(str);
			length += str.length();
			}
			else
			{
				length += str.length();
				length++;
			if (length <= 80)
			{
			System.out.print(' ');
			System.out.print(str);
			}
			else
			{
				System.out.print("\n");
				System.out.print(str);
				length = str.length();
			}
			}
		}
		return 0;
	}

}

