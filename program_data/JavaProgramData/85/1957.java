package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String s = new String(new char[21]);
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < 21;j++)
		{
			s = s.substring(0, i);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		if ((s.charAt(0) < 'A' || s.charAt(0)>'z' || (s.charAt(0) < 'a' && s.charAt(0)>'Z')) && s.charAt(0) != '_')
		{
			  System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto m;
		}
		for (j = 1;s.charAt(j) != '\0';j++)
		{
		  if ((s.charAt(j) < '0' || s.charAt(j)>'z' || (s.charAt(j) > '9' && s.charAt(j) < 'A') || (s.charAt(j) < 'a' && s.charAt(j)>'Z')) && s.charAt(j) != '_')
		  {
			  System.out.print("no\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto m;
		  }
		}
		System.out.print("yes\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		m:
		;
	  }
	  return 0;
	}

}

