package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String sz = new String(new char[30]);
	int n;
	int e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   sz = tempVar2.charAt(0);
	   }
	   e = 1;
	   for (int j = 0;j < sz.length();j++)
	   {
		   if ((sz.charAt(j) == '_') || (sz.charAt(j) >= 'A' && sz.charAt(j) <= 'Z') || (sz.charAt(j) >= 'a' && sz.charAt(j) <= 'z') || (sz.charAt(j) >= '0' && sz.charAt(j) <= '9' && j>0))
		   {
			 continue;
		   }
		   else
		   {
			 e = 0;
			 break;
		   }
	   }
	   if (e == 0)
	   {
		 System.out.print("no\n");
	   }
	   else
	   {
		 System.out.print("yes\n");
	   }
	}

	return 0;
	}
}

