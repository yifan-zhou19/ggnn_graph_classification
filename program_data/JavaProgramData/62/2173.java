package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char i = 0;
		String aa = new String(new char[100]);
		aa = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = aa;
		while (*p != '\0')
		{
		if (*p != ' ')
		{
		System.out.print(p);
		}
		if (*p == ' ')
		{
		   System.out.print(p);
		   q = p;
		   q++;
		   while (*q == ' ')
		   {
				   q++;
		   }
				  q--;
				  p = q;
		}
				p++;
		}

				  return 0;
	}

}
