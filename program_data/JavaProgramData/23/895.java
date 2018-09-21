package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int l;
	 int len;
	 String a = new String(new char[526]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * fr;
	 String ta;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 a = new Scanner(System.in).nextLine();
	 len = a.length();
	 for (i = len;i >= 0;i--)
	 {
		 *(a.Substring(i) + 1) = *(a.Substring(i));
	 }
	 *(a.Substring(len) + 1) = *a = ' ';
	 ta = a.Substring(len) + 1;
	 for (p = a.Substring(len);p >= a;p--)
	 {
		 if (*p == ' ')
		 {
			 for (fr = p + 1;fr < ta;fr++)
			 {
				 System.out.printf("%c",*fr);
			 }
			 if (p != a)
			 {
				 System.out.print(" ");
			 }
			 ta = p;
		 }
	 }


	}
}
