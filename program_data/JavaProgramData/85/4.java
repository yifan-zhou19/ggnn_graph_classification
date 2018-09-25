package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  String buf = new String(new char[1024]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * tmp;
	  int i;
	  int ok;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0; i < n; ++i)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			buf = tempVar2.charAt(0);
		}
		ok = 1;
		tmp = buf;
		if (Character.isDigit(*tmp))
		{
		  ok = 0;
		}
		else
		{
		  while (*tmp != 0)
		  {
			if (!Character.isLetterOrDigit(*tmp) && *tmp != '_')
			{
			  ok = 0;
			  break;
			}
			++tmp;
		  }
		}
		if (ok == 1)
		{
		  System.out.print("yes\n");
		}
		else
		{
		  System.out.print("no\n");
		}
	  }
	  return 0;
	}
}

