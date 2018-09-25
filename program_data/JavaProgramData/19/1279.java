package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		String a;
		String b;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(20);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(20);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p = s;
		int i;
		while (*s != '\0')
		{
			if (*s != ' ')
			{
				s = s + 1;
			}
			else if (*s == ' ')
			{
				*s = '\0';
				s = s + 1;
				if (strcmp(p,a) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",p);
				}
				p = s;
			}
		}
		if (strcmp(p,a) == 0)
		{
			System.out.printf("%s",b);
		}
		else
		{
			System.out.printf("%s",p);
		}
	return 0;
	}
}
