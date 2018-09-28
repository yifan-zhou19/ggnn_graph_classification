package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	double c;
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[100];
	int[] b = new int[100];
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[0] = Integer.parseInt(tempVar3);
	}
	c = b[0] * 1.0000 / a[0];
	for (i = 1;i < n;i++)
	{
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   a[i] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   b[i] = Integer.parseInt(tempVar5);
	   }
	   d = b[i] * 1.0000 / a[i];
	   if (d - c > 0.05)
	   {
	   System.out.print("better\n");
	   }
	   else if (c - d > 0.05)
	   {
		System.out.print("worse\n");
	   }
	   else
	   {
	   System.out.print("same\n");
	   }
	}


	return 0;
	}
}

