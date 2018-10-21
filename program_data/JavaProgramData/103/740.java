package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[2000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i = 1;
		int count = 1;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == a.charAt(i - 1) || a.charAt(i) == a.charAt(i - 1) + 32 || a.charAt(i) == a.charAt(i - 1) - 32)
			{
				count++;
			}
			else
			{
				if (a.charAt(i - 1) <= 'Z')
				{
					System.out.print('(');
					System.out.print(a.charAt(i - 1));
					System.out.print(',');
					System.out.print(count);
					System.out.print(')');
					count = 1;
				}
				else
				{
					System.out.print('(');
					System.out.print((char)(a.charAt(i - 1) - 32));
					System.out.print(',');
					System.out.print(count);
					System.out.print(')');
					count = 1;
				}

			}
			i++;
		}
		if (a.charAt(i - 1) <= 'Z')
		{
			System.out.print('(');
			System.out.print(a.charAt(i - 1));
			System.out.print(',');
			System.out.print(count);
			System.out.print(')');
		}
		else
		{
			 System.out.print('(');
			 System.out.print((char)(a.charAt(i - 1) - 32));
			 System.out.print(',');
			 System.out.print(count);
			 System.out.print(')');
		}
		return 0;
	}
}

