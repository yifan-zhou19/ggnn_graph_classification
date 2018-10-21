package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
	  String q;
	  char c;
	  int n;
	  int i;
	  s = new Scanner(System.in).nextLine();
	  n = s.length();
	  q = s;
	  p = s;
	  for (i = 0;i < n - 1;i++)
	  {
	   c = p + *(p + 1);
	   p++;
	   System.out.printf("%c",c);
	  }
	  c = p + q;
	  System.out.printf("%c",c);

	}
}
