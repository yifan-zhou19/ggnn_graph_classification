package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int flag;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String a = new String(new char[21]);

	  for (i = 0;i < n;i++)
	  {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   flag = 0;
	   if ((a.charAt(0) == '_') || ((a.charAt(0) <= 'z') && (a.charAt(0) >= 'a')) || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')))
	   {
		  for (j = 1;a.charAt(j) != '\0';j++)
		  {
			  if (!((a.charAt(j) == '_') || ((a.charAt(j) <= 'z') && (a.charAt(j) >= 'a')) || ((a.charAt(j) >= 'A') && (a.charAt(j) <= 'Z')) || ((a.charAt(j) >= '0') && (a.charAt(j) <= '9'))))
			  {
			   flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			  goto m;
			  }
			  else
			  {
			   flag = 1;
			   continue;
			  }
		  }

	   }


//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	 m:
	 if (flag != 0)
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

