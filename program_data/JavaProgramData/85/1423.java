package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int p;
	int b;
	String a = new String(new char[22]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   b = a.length();

	   for (p = 0;p < b;p++)
	   {
		   if ((a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || a.charAt(0) == '_')
		   {
			  if (a.charAt(p) == '_' || (a.charAt(p) >= 'a' && a.charAt(p) <= 'z') || (a.charAt(p) >= 'A' && a.charAt(p) <= 'Z') || (a.charAt(p) >= '0' && a.charAt(p) <= '9'))
			  {
				  if (p == b - 1)
				  {
					  System.out.print("yes\n");
					  break;
				  }
				  else
				  {
			   continue;
				  }
			  }
			  else
			  {
			   System.out.print("no\n");
			   break;
			  }
		   }
		  else
		  {
			  System.out.print("no\n");
			  break;
		  }

	   }
	}
	return 0;
	}
}

