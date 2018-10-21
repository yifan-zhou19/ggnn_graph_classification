package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double r;
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
		}
		r = (double)b[0] / a[0];
		for (i = 1;i < n;i++)
		{
		   if ((double)b[i] / a[i] - r > 0.05)
		   {
			   System.out.print("better\n");
		   }
		   else if (r - (double)b[i] / a[i] > 0.05)
		   {
			   System.out.print("worse\n");
		   }
		   else
		   {
			   System.out.print("same\n");
		   }
		}
	}

}

