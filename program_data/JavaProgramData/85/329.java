package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String s = new String(new char[21]);
	   int i;
	   int n;
	   int len;
	   int j;
	   int x = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   x = 0;
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   s = tempVar2.charAt(0);
		   }
		   len = s.length();
		   if ((s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || s.charAt(0) == '_')
		   {
			   for (j = 1;j < len;j++)
			   {
				   if ((s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) == '_'))
				   {
					   x = x + 0;
				   }
				   else
				   {
					   x = x + 1;
				   }
			   }
			   if (x == 0)
			   {
				   System.out.print("yes\n");
			   }
			   else
			   {
				   System.out.print("no\n");
			   }
		   }
		   else
		   {
			   System.out.print("no\n");
		   }
	   }
	}
}

