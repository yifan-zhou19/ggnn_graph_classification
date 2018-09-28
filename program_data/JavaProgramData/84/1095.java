package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 1;
	 int a;
	 int b = 0;
	 int c = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (i <= n)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = Integer.parseInt(tempVar2);
	  }
	  if (a > b)
	  {
	   c = b,b = a;
	  }
	  else
	  {
	   if (a > c)
	   {
		c = a;
	   }
	  }
	  i++;
	 }
	 System.out.printf("%d\n%d",b,c);
	}
}

