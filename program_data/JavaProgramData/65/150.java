package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int o = 0;
		int p = 0;
		int q = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
		int[] a = new int[n];
		int[] b = new int[n];
	   for (i = o;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		if (a[i] == 0 && b[i] == 1 || a[i] == 1 && b[i] == 2 || a[i] == 2 && b[i] == 0)
		{
		   o++;
		}
		  else if (a[i] == b[i])
		  {
			   p++;
		  }
		  else
		  {
		  q++;
		  }
	   }
		  if (o > q)
		  {
		  System.out.print("A");
		  }
		 else if (o < q)
		 {
		 System.out.print("B");
		 }
		 else
		 {
		 System.out.print("Tie");
		 }
		 return 0;
	}

}

