package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[55]);
	String b = new String(new char[55]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * q = b;
	int z;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}

	int l;
	int i;
	for (i = 0;i < b.length();i++)
	{
	z = 1;
	p = a;
	if (*p == b.charAt(i))
	{
		l = i;
		q = b.Substring(i);
		while (*p != '\0')
		{
		if (*p != *q)
		{
			z = 0;
		}
		p++;
		q++;
		}
	}
	else
	{
		continue;
	}
	if (z == 0)
	{
		continue;
	}
	else
	{
		System.out.printf("%d\n",l);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto loop;
	}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	;
	}
}

