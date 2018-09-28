package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p;
	   char c;
	   int len;
	   s = new Scanner(System.in).nextLine();
	   len = s.length();
	   c = s;
	   for (p = s;p < s.Substring(len) - 1;p++)
	   {
		   *p = p + *(p + 1);
	   }
		   *p = p + c;
		 for (p = s;p < s.Substring(len);p++)
		 {
			 System.out.print(p);
		 }
		 return 0;
	}
}
