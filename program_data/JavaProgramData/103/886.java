package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1010]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 0;
		int count = 1;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i + 1) == a.charAt(i) || a.charAt(i + 1) - 'a' == a.charAt(i) - 'A' || a.charAt(i + 1) - 'A' == a.charAt(i) - 'a')
			{
				count++;
			}
			else
			{
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					System.out.print('(');
					System.out.print((char)('A' + a.charAt(i) - 'a'));
					System.out.print(',');
					System.out.print(count);
					System.out.print(')');
					count = 1;
				}
				else
				{
					System.out.print('(');
					System.out.print(a.charAt(i));
					System.out.print(',');
					System.out.print(count);
					System.out.print(')');
					count = 1;
				}
			}
				i++;
		}
		System.out.print("\n");

		return 0;
	}

}

