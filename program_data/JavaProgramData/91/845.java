package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String a = new String(new char[100]);
	  int n;
	  int i;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  p1 = a.charAt(0);
	  p2 = a.charAt(1);
	  for (i = 0;i <= (n - 2);i++)
	  {
			System.out.printf("%c",*p1 + *p2);
			p1++;
			p2++;
	  }
	  p1 = a.charAt(0);
	  p2 = a.charAt(n - 1);
	  System.out.printf("%c",*p1 + *p2);


	}
}
