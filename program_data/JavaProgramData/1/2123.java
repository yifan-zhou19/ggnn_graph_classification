package <missing>;

public class GlobalMembers
{
	public static int f(int a,int s)
	{
	   int y = 0;
	   for (;s <= a;s++)
	   {
		   if (s == a)
		   {
			  y += 1;
		   }
		   else if (s > 1 && a % s == 0)
		   {
			  y += f(a / s, s);
		   }
	   }
	   return y;
	}
	public static int Main()
	{
		 int n;
		 int i;
		 int a;
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
				  a = Integer.parseInt(tempVar2);
			  }
			  System.out.printf("%d\n",f(a, 1));
		 }
	}
}

