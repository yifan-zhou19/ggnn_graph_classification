package <missing>;

public class GlobalMembers
{
	public static char boy;

	public static void f(tangible.RefObject<String> s)
	{
		int i;
		int j;
		int counter = 0;
		for (i = 0;s.argValue.charAt(i) != '\0';i++)
		{
			if (s.argValue.charAt(i) == boy)
			{
				for (j = i + 1;s.argValue.charAt(j) != '\0';j++)
				{
					if (s.argValue.charAt(j) == boy)
					{
						break;
					}
					else if (s.argValue.charAt(j) != '0')
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
						s.argValue.charAt(i) = '0';
						s.argValue.charAt(j) = '0';
						f(s);
					}
				}
			}
		}
	}

	public static int Main()
	{
		String s = new String(new char[101]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		boy = s.charAt(0);
	tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
		f(tempRef_s);
		s = tempRef_s.argValue;
		return 0;
	}

}

