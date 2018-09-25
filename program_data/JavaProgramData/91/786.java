package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String s1 = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String p1;
		int i = 0;
		s = new Scanner(System.in).nextLine();
		p1 = s;
		for (p = s,q = s1; * p != '\0';p++,q++,i++)
		{
			  if (*(p + 1) != '\0')
			  {
			  *q = p + *(p + 1);
			  }
			  else
			  {
				  *q = p + p1;
			  }
		}
		for (q = s1;q < (s1.Substring(i));q++)
		{
		   System.out.printf("%c",*q);
		}
	}
}
