package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		  int a;
		  int b;
		  int n;
		  int i;
		  int p = 0;
		  int q = 0;
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
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   b = Integer.parseInt(tempVar3);
			   }
				if (a == 2 && b == 0)
				{
					p += 1;
				}
				else if (a == 1 && b == 2)
				{
					p += 1;
				}
				else if (a == 0 && b == 1)
				{
					p += 1;
				}
				else if (b == 2 && a == 0)
				{
					q += 1;
				}
				else if (b == 1 && a == 2)
				{
					q += 1;
				}
				else if (b == 0 && a == 1)
				{
					q += 1;
				}
				else if (a = b)
				{
					p += 0;
				}
			 }

			 if (p > q)
			 {
				 System.out.print("A");
			 }
			 else if (p < q)
			 {
				 System.out.print("B");
			 }
			 else if (p = q)
			 {
				 System.out.print("Tie");
			 }









			   return 0;
	  }
}

