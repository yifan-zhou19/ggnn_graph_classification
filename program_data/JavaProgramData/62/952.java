package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = a;
		 int len;

		 a = new Scanner(System.in).nextLine();
		 len = a.length();

		 while (p < a.Substring(len))
		 {
		 if ((*p == ' ') && (*(p + 1) == ' '))
		 {
			 p++;
		 }
		 else
		 {
			 System.out.print(p);
			 p++;
		 }
		 }
		 return 0;
	}
}
