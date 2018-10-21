package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int a;
	   int b;
	   int p = 0;
	   int q = 0;
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
				   a = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b = Integer.parseInt(tempVar3);
			   }
			   if (a - b == 1)
			   {
				   p++;
			   }
			   if (a - b == -2)
			   {
				   p++;
			   }
			   if (a - b == -1)
			   {
				   q++;
			   }
			   if (a - b == 2)
			   {
				   q++;
			   }
	   }
	   if (q > p)
	   {
		   System.out.print("A");
	   }
	   if (q < p)
	   {
		   System.out.print("B");
	   }
	   if (p == q)
	   {
		   System.out.print("Tie");
	   }
			return 0;
	}
}

