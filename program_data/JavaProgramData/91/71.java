package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String ch = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[101]);
		int len;
		int i = 0;
		ch = new Scanner(System.in).nextLine();
		p = ch;
		len = ch.length();
		for (p = ch;p < ch.Substring(len);p++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, *p + *(p + 1));
			if (p == ch.Substring(len) - 1)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, *(p) + ch.charAt(0));
			}
			System.out.printf("%c",a.charAt(i));
			i++;
		}
		System.out.print("\n");
	}

}

