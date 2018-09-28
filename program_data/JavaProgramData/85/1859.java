package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int x;
	   int m;
	   int n;
	   int b;
	   int c;
	   String a = new String(new char[21]);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (m = 0;m < n;m++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a = tempVar2.charAt(0);
	   }
	   x = a.length();
	   if ((a.charAt(0) == '_') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z'))
	   {
	   b = 0;
	   }
	   else
	   {
	   b = 1;
	   }
	   for (i = 1;i < x;i++)
	   {
	   if ((a.charAt(i) == '_') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= '0') && a.charAt(i) <= '9')
	   {
		   c = 0;
	   }
	   else
	   {
		   c = 1;
		   break;
	   }
	   }
	   if (b == 1 || c == 1)
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

