package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int a;
	 int b;
	 int c;
	 int t;
	 int t1;
	 int t2;
	 char q;
	 a = 0;
	 b = 0;
	 t2 = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(null, 1);
	 if (tempVar2 != null)
	 {
		 q = tempVar2.charAt(0);
	 }
	 while (q == ',')
	 {
		 a++;
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 c = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead(null, 1);
		 if (tempVar4 != null)
		 {
			 q = tempVar4.charAt(0);
		 }
		 if (c >= t1)
		 {
		   if (c == t1)
		   {
			   b = b + 1;
		   }
		   else
		   {
				 t = t1;
				 t1 = c;
				 t2 = t;
		   }
		 }
		 else if (c > t2)
		 {
			 t2 = c;
		 }
	 }
	 if ((a == b) || (a == 0))
	 {
		 System.out.print("No\n");
	 }
	 else
	 {
		 System.out.printf("%d",t2);
	 }
	 return 0;
	}
}

