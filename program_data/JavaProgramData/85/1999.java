package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		String sz = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz = tempVar2.charAt(0);
		   }
			a = 0;
		   for (i = 0;i < sz.length();i++)
		   {
		   if (((sz.charAt(i) >= '0') && (sz.charAt(i) <= '9')) || ((sz.charAt(i) >= 'a') && (sz.charAt(i) <= 'z')) || ((sz.charAt(i) >= 'A') && (sz.charAt(i) <= 'Z')) || (sz.charAt(i) == '_'))
		   {
			  a = a + 1;
		   }
		   }
		  if ((sz.charAt(0) >= '0') && (sz.charAt(0) <= '9'))
		  {
			   a = 0;
		  }
		if (a == sz.length())
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

