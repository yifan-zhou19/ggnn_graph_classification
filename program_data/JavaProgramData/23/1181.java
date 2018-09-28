package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String r;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		p = s + s.length() - 1;
		for (;p >= s;p--)
		{
			if (*p == ' ')
			{
				r = p + 1;
				System.out.printf("%s ",r);
				*p = '\0';
			}
			if (p == s)
			{
				System.out.printf("%s",p);
			}
		}
	}
}
