package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[100]);

//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static search(int n)
	{
		 String p1;
		 String p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p;
		 String p3;
		 String p4;
		 int max;
		 int min;
		 p1 = str.charAt(0);
		 max = 0;
		 min = 100;
		 for (p = str.charAt(0);p <= str.charAt(n);p++)
		 {
			 if ((*p < 65) || ((*p>90) && (*p < 97)) || (*p>122) || (p == str.charAt(n)))
			 {
				 if ((p - p1) > max)
				 {
					 max = p - p1;
					 p3 = p1;
				 }
				 if ((p - p1) < min)
				 {
					 min = p - p1;
					 p4 = p1;
				 }
				 p++;
				 p1 = p;
			 }
		 }
		 for (p = p3;p < p3.Substring(max);p++)
		 {
			 System.out.printf("%c",*p);
		 }
		 System.out.print("\n");
		 for (p = p4;p < p4.Substring(min);p++)
		 {
			 System.out.printf("%c",*p);
		 }
		 System.out.print("\n");
	}

	public static int Main()
	{
		int lenth;
		str = new Scanner(System.in).nextLine();
		lenth = str.length();
		search(lenth);

	}
}
