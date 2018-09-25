package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[202]);
		String a = new String(new char[202]);
		String b = new String(new char[202]);
		String ch = new String(new char[202]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int k = 0;
		for (int j = 0;j < s.length();++j)
		{
			if (s.charAt(j) != ' ')
			{
				ch = tangible.StringFunctions.changeCharacter(ch, k, s.charAt(j));
				++k;
			}
			else
			{
				ch = tangible.StringFunctions.changeCharacter(ch, k, '\0');
				if (!strcmp(ch,a))
				{
					System.out.print(b);
					System.out.print(" ");
				}
				else
				{
					System.out.print(ch);
					System.out.print(" ");
				}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(ch,0,(Character.SIZE / Byte.SIZE) * k);
				k = 0;
			}
			if (j == s.length() - 1)
			{
				if (!strcmp(ch,a))
				{
					System.out.print(b);
					System.out.print("\n");
				}
				else
				{
					System.out.print(ch);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

