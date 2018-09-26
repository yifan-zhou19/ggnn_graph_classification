package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[80]);
	  String b = new String(new char[80]);
	  a = new Scanner(System.in).nextLine();
	  b = new Scanner(System.in).nextLine();
	  int i;
	  int n1;
	  int n2;
	  n1 = a.length();
	  n2 = b.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p1 = a;
	  for (i = 0;i < n1;i++)
	  {
		  if (strcmp(p1,"a") >= 0 && strcmp(p1,"z") <= 0)
		  {
		   a.charAt(i) -= 32;
		  }
	   p1++;
	  }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p2 = b;
	  for (i = 0;i < n2;i++)
	  {
		  if (strcmp(p2,"a") >= 0 && strcmp(p2,"z") <= 0)
		  {
		   b.charAt(i) -= 32;
		  }
	   p2++;
	  }
	  if (strcmp(a,b) < 0)
	  {
		  System.out.print("<");
	  }
	   else if (strcmp(a,b) == 0)
	   {
		  System.out.print("=");
	   }
	  else if (strcmp(a,b) > 0)
	  {
		  System.out.print(">");
	  }
	  return 0;
	}
}
