package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int a = 1;
	 int b = 0;
	 int n;
	 int i;
	 int x;
	 int q;

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
			   x = Integer.parseInt(tempVar2);
		   }

		   q = (x > a) + (x > b);

		   switch (q)
		   {
		   case 2:

			  b = a,a = x;
			  break;
		   case 1:
			  b = x;
			  break;
		   case 0:
			  break;

		   }
	 }
	  System.out.printf("%d\n%d",a,b);


	  return 0;

	 }
}

