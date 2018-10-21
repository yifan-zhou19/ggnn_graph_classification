package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] c = new int[100];
		int a = 0;
		int b = 0;
		int m = 0;
		int d = 0;
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
				c[i] = Integer.parseInt(tempVar2);
			}
		   if (c[i] < 19)
		   {
			   a += 1;
		   }
		   else if (c[i] < 36)
		   {
			   b += 1;
		   }
		   else if (c[i] < 61)
		   {
			   m += 1;
		   }
		   else
		   {
			   d += 1;
		   }
		}
		System.out.printf("1-18: %.2lf",(double)a / n * 100);
		System.out.print("%%\n");
	System.out.printf("19-35: %.2lf",(double)b / n * 100);
		System.out.print("%%\n");
	System.out.printf("36-60: %.2lf",(double)m / n * 100);
		System.out.print("%%\n");
	System.out.printf("60??: %.2lf",(double)d / n * 100);
		System.out.print("%%\n");

	}
}

