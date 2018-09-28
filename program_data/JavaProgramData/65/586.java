package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] a = new int[1000];
	int[] b = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int c;
	int d;
	c = 0;
	d = 0;
	for (i = 0;i < n;i++)
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
	   if (a[i] - b[i] == 0)
	   {
		  c += 0;
	   }
		  else if ((b[i] - a[i] == 1) || ((a[i] == 2) && (b[i] == 0)))
		  {
		  c += 1;
		  }
		  else
		  {
		  d += 1;
		  }
	}
	 if (c > d)
	 {
	 System.out.print("A");
	 }
	 else if (c < d)
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

