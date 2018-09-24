package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[10]);
		char a;
		int i = 0;
		int n;
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		do
		{
			 i++;
			 p++;
			 a = p;
		}while (a != '\0');
		n = i;
		String s = new String(new char[10]);
		for (i = 0;i < n;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, str.charAt(n - i - 1));
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
	}
}

