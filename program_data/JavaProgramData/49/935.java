package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p1', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p2', so pointers on this parameter are left unchanged:
	public static void f(char * p1, char * p2)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = p1;
		 String q = p2;
		 for (;p1 < p2;p1++,p2--)
		 {
		 if (*p1 != *p2)
		 {
			 break;
		 }
		 }
		 if (p1 >= p2)
		 {
			 for (;p <= q;p++)
			 {
				 System.out.printf("%c",*p);
			 }
			 System.out.print("\n");
		 }
	}
	public static void Main(String[] args)
	{
	  String a = new String(new char[500]);
	  int i;
	  int j;
	  String p;
	  String q;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  for (i = 1;i <= a.length() - 1;i++)
	  {
	  for (j = 0;j < a.length() - i;j++)
	  {
		  p = a.Substring(j);
		  q = a.Substring(i) + j;
		  f(p, q);
	  }
	  }
	}

}

