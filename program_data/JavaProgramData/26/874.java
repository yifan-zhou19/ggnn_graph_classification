package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p;
	  String c = new String(new char[101]);
	  c = new Scanner(System.in).nextLine();
	  p = c;
	  while (*p != '\0')
	  {
		if (*p > 32)
		{
			System.out.print(p);
		}
		else
		{
		  System.out.print(' ');
		  do
		  {
			  p++;
		  }while (*p < 33);
		  System.out.print(p);
		}
		p++;
	  }
	  return 0;
	}

}
