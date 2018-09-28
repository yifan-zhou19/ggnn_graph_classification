package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void f(char * p)
	{
		 int i;
		 for (i = 0;i <= 29;i++)
		 {
		 if ((*p) >= '0' && (*p) <= '9')
		 {
		 System.out.printf("%c",*p);
		 }
		 else if (*(p.Substring(1)) >= '0' && *(p.Substring(1)) <= '9')
		 {
		 System.out.print("\n");
		 }
		 p = p.Substring(1);
		 }
	}




	public static void Main(String[] args)
	{
	  String a = new String(new char[30]);
	  a = new Scanner(System.in).nextLine();
	  String p;
	  p = a;
	  f(p);
	}

}
