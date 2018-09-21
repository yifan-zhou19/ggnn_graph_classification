package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * f;
		int n;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		p = s.Substring(n) - 1;
		q = s.Substring(n);
		for (p = s.Substring(n) - 1;p >= s;p--)
		{
			if (*p == ' ')
			{
				for (f = p + 1;f < q;f++)
				{
					System.out.printf("%c",*f);
				}
				System.out.print(" ");
				q = p;
			}
		}
		p = s;
		for (p = s;;p++)
		{
			if (*p != ' ' && *p != '\0')
			{
			System.out.printf("%c",*p);
			}
			else
			{
			break;
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, n, '\0');
	}
}

