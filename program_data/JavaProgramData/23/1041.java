package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * t = a;
	int n;
	a = new Scanner(System.in).nextLine();
	n = a.length();
		for (p = p + n - 1;p >= a;)
		{
			if ((*p) == ' ')
			{
					 for (t = p + 1;(*t) != '\0';t++)
					 {
				   System.out.printf("%c",*t);
					 }
				   System.out.print(" ");
				   *p = '\0';
					p--;
			}
			else
			{
				p--;
			}
		}
	p = a;
	System.out.printf("%s",p);
	}

}
