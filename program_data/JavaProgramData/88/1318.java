package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
	String c = new String(new char[35]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
		 c = new Scanner(System.in).nextLine(); //?????
		 for (p = c; * p != 0;p++)
		 {
			 if (*p >= 48 && *p <= 57) //????????
			 {
			 for (j = 0;1;j++)
			 {
			 if ((*(p + j)) >= 48 && (*(p + j) <= 57))
			 {
			System.out.print((p + j));
			 }
		 else
		 {
			 System.out.print("\n");
			 break;
		 } //?????????????
			 }
		 p = p + j - 1;
			 }
		 }
		return 0;
	}
}
