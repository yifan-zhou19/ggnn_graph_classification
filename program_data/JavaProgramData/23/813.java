package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		String[] string = new String[50];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		int c = 0;
		int i;
		s = new Scanner(System.in).nextLine();
		String[c++] = s.charAt(0);
		for (i = 0; * p != '\0';i++,p++)
		{
			if (*p == ' ')
			{
				*p = '\0';
				String[c++] = p + 1;
			}
		}
		c--;
		for (;c >= 0;c--)
		{
			System.out.printf("%s",string[c]);
			if (c != 0)
			{
				System.out.print(" ");
			}
		}
	}
}
