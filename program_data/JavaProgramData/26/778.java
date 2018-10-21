package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[122]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		for (p = str; * p;p++)
		{
		  if (*p == ' ')
		  {
			 while (*p == ' ')
			 {
				p++;
			 }
			  p--;
			  System.out.print(p);
		  }
		  else
		  {
			  System.out.print(p);
		  }
		}
		  int ss;
		  ss = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  return 0;
	}

}

