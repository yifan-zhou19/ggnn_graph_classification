package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int k;
	  int n;
	  int c;
	  int d;
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	for (i = 0;i < n;i++)
	{
		a[i] = 1;
		b[i] = 0;
	}
	  for (;;)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
	   if (c == 0 && d == 0)
	   {
		   break;
	   }
		 a[c] = 0;
		 b[d] = b[d] + 1;
	  }

	   for (i = 0;i < n;i++)
	   {
	   if (a[i] == 1 && b[i] == n - 1)
	   {
		  k = 1;
		  System.out.printf("%d",i);
	   }
	   }
	   if (k == 0)
	   {
	   System.out.print("NOT FOUND");
	   }
		System.in.read();
	   System.in.read();
	}

}

