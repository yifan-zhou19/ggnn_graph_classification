package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int[] a = new int[200];
	   int[] b = new int[200];
	   int A = 0;
	   int B = 0;
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
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  if (a[i] == b[i])
		  {
			 continue;
		  }
		  if (a[i] == 0)
		  {
			if (b[i] == 2)
			{
				B += 1;
			}
			else
			{
				A += 1;
			}
		  }
		  if (a[i] == 1)
		  {
			if (b[i] == 0)
			{
				B += 1;
			}
			else
			{
				A += 1;
			}
		  }
		  if (a[i] == 2)
		  {
			if (b[i] == 1)
			{
				B += 1;
			}
			else
			{
				A += 1;
			}
		  }
	   }
	   if (A > B)
	   {
		 System.out.print("A");
	   }
	   if (A < B)
	   {
		   System.out.print("B");
	   }
	  if (A == B)
	  {
		  System.out.print("Tie");
	  }
	   return 0;
	}
}

