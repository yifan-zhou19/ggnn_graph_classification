package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int j;
		int k;
		ch = new Scanner(System.in).nextLine();
		k = ch.length();
		p = ch;
		for (i = 0;i < k - 1;i++)
		{
			str = tangible.StringFunctions.changeCharacter(str, i, *p + *(p + 1));
			p++;
		}
		str = tangible.StringFunctions.changeCharacter(str, k - 1, *p + ch.charAt(0));
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",str.charAt(i));
		}
		return 0;
	}
}

