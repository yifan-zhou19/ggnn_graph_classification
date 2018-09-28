package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		int i;
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		String b;
		a = b = s.charAt(0);
		int n;
		n = s.length();
		s = tangible.StringFunctions.changeCharacter(s, n, '\0');
		for (i = 0;i < n;i++)
		{
			a = a + 1;
			if (*a == ' ' && *(a - 1) != ' ')
			{
				System.out.printf("%d,",a - b);
			}
			if (*(a - 1) == ' ' && *a != ' ')
			{
				b = a;
			}
			if (*a == '\0')
			{
				System.out.printf("%d",a - b);
			}
		}
	}
}

