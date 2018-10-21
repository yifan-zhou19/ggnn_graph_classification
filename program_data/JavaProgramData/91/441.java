package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  final String a = "";
	  final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p = 0;
	  int i;
	  int len;
	  a = new Scanner(System.in).nextLine();
	  len = a.length();
	  for (p = a,i = 0;p < a.Substring(len) - 1;i++,p++)
	  {
		  b = tangible.StringFunctions.changeCharacter(b, i, *p + *(p + 1));
	  }
	  p = a;
	  b = tangible.StringFunctions.changeCharacter(b, len - 1, *(p + len - 1) + *p);
	  System.out.println(b);
	  return 0;
	}

}

