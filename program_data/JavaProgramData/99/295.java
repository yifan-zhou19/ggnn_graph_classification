package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] br = new int[101];
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
			   br[i] = Integer.parseInt(tempVar2);
		   }
		   if (br[i] < 19)
		   {
			  a += 1;
		   }
		   else if (br[i] < 36)
		   {
			  b += 1;
		   }
		   else if (br[i] < 61)
		   {
			  c += 1;
		   }
		   else
		   {
			  d += 1;
		   }
		}
		a = a / n;
		b = b / n;
		c = c / n;
		d = d / n;
		System.out.printf("1-18: %.2lf%%\n",a * 100);
		System.out.printf("19-35: %.2lf%%\n",b * 100);
		System.out.printf("36-60: %.2lf%%\n",c * 100);
		System.out.printf("60??: %.2lf%%\n",d * 100);
		return 0;
	}
}

