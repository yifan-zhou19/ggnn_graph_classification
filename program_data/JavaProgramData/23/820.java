package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		String s;
		int i;
		int j;
		int n;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (p = str.Substring(n);p >= str;p--)
		{
			if ((*p) == ' ')
			{
				for (t = p + 1;((*t) != ' ') && ((*t) != '\0');t++)
				{
					System.out.printf("%c",*t);
				}
				System.out.print(" ");
			}

		}
		for (s = str;(s != ' ') && (s != '\0');s++)
		{
			System.out.printf("%c", s);
		}
	}
}
