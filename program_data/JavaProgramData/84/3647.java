package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i = 3;
	 int a;
	 int b;
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 b = Integer.parseInt(tempVar3);
	 }


	 while (i <= n)
	 {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   x = Integer.parseInt(tempVar4);
	   }

	   if ((a < x) && (x < b))
	   {
		   a = x;
	   }
	   else if (x > b)
	   {
		   b = x;
	   }


	   i++;

	 }
	 if (a < b)
	 {
	 System.out.printf("%d\n%d",b,a);
	 }
	 else
	 {
		 System.out.printf("%d\n%d",a,b);
	 }
	 return 0;
	}
}

