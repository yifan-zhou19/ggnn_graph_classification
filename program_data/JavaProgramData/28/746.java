package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j = 0;
	String a = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = a;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (p = a;;p++)
	{
	if (*p == ' ')
	{
			 if (*(p - 1) != ' ')
			 {
				 System.out.printf("%d,",j);
				 j = 0;
			 }
			 else
			 {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				 goto z;
			 }
	}
	else if (*p == '\0')
	{
		System.out.printf("%d",j);
		break;
	}
		  else
		  {
			  j = j + 1;
		  }
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	z:
	;
	}
	}

}
