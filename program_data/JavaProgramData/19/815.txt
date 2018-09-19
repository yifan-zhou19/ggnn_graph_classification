package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (;;s++)
	{
		p = a;
	 t = s;
	while (*s == *p && *s != ' ' && *s != '\0')
	{
		p++;
	s++;
	}
	if (*s == ' ' && *p == '\0')
	{
		System.out.printf("%s",b);
	System.out.print(" ");
	continue;
	}
	else if (*s == '\0' && *p == '\0')
	{
		System.out.printf("%s",b);
	break;
	}
	while (*s != ' ' && *s != '\0')
	{
	s++;
	}
	if (*s == ' ')
	{
		for (; * t != ' ';t++)
		{
	System.out.printf("%c",*t);
		}
	System.out.print(" ");
	}
	if (*s == '\0')
	{
		for (; * t != '\0';t++)
		{
	System.out.printf("%c",*t);
		}
	break;
	}
	}


	}













}
