package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String x = new String(new char[101]);
		char fir;
	 x = new Scanner(System.in).nextLine();
	 fir = x.charAt(0);
	 for (p = x; * (p + 1) != '\0';p++)
	 {
		 *p = p + *(p + 1);
	 }
	 *p = p + fir;
	 System.out.printf("%s",x);
	}
}
