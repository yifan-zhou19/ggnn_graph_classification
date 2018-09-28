package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		char ch;
		int len;
		a = new Scanner(System.in).nextLine();
		//cin.get();
		for (len = 0 ; a.charAt(len) != '\0'; ++len)
		{
			;
		}
		//++len;
		for (int i = 0; i < len; ++i)
		{
			cin.get(ch);
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A' && ch >= 'a' && ch <= 'z')
			{
				ch -= 32;
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && ch <= 'Z' && ch >= 'A')
			{
				ch += 32;
			}
			if (a.charAt(i) > ch)
			{
				System.out.print('>');
				return 0;
			}
			if (a.charAt(i) < ch)
			{
				System.out.print('<');
				return 0;
			}
		}
		System.out.print('=');
		return 0;
	}
}
