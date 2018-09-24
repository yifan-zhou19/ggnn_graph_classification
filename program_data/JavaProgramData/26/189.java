package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String m;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		m = a;
		p = a;
		while (a.charAt(i) != '\0')
		{
			if (a.charAt(i) == ' ')
			{
				*p = ' ';
				p++;
				while (a.charAt(i) == ' ')
				{
					i++;
				}
				*p = a.charAt(i);
			}
			else
			{
				*p = a.charAt(i);
				p++;
				i++;
			}
		}
		*p = '\0';
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}
}
