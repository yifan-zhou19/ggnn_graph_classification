package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		q = s;
		for (p = s;;p++)
		{
			if (*p == '\0')
			{
				if (strcmp(q,a) == 0)
				{
					System.out.printf("%s",b);
					break;
				}
				System.out.printf("%s",q);
				break;
			}
			if (*p == ' ')
			{
				*p = '\0';
				if (strcmp(q,a) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",q);
				}
				q = p + 1;
			}
		}
		return 0;
	}









}
