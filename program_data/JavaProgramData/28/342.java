package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[3000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = a;
	int i;
	a = new Scanner(System.in).nextLine();
	for (i = 0;;i++)
	{
	if (*p == '\0')
	{
	System.out.printf("%d",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto z;
	}
	else if (*p == ' ')
	{
	System.out.printf("%d",i);
	p++;
	break;
	}
	else
	{
		p++;
	}
	}
	for (;;)
	{
	for (i = 0;;i++)
	{
	if (*p == '\0')
	{
	System.out.printf(",%d",i);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	goto z;
	}
	else if (*p == ' ' && i == 0)
	{
	p++;
	break;
	}
	else if (*p == ' ')
	{
	System.out.printf(",%d",i);
	p++;
	break;
	}
	else
	{
		p++;
	}
	}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	z:
	;
	}
}
