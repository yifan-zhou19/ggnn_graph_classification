package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				System.out.printf("%c",*p);
				p++;
			}
			if (*p == ' ')
			{
				System.out.print(" ");
				do
				{
					p++;
				}while (*p == ' ');
			}
		}

	}







}
