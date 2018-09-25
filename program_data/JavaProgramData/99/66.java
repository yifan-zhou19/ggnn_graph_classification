package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int[] a = new int[100];
		int n;
		double b1 = 0;
		double b2 = 0;
		double b3 = 0;
		double b4 = 0;
		int i;
		double sum;

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
		}


		for (i = 0;i < n;i++)
		{
		   if (a[i] <= 18)
		   {
				b1++;
		   }
		   else if (a[i] <= 35)
		   {
			   b2++;
		   }
		   else if (a[i] <= 60)
		   {
			   b3++;
		   }
		   else
		   {
			   b4++;
		   }
		}
		sum = (b1 + b2 + b3 + b4) * 0.01;
		System.out.printf("1-18: %.2lf%%\n",b1 / sum);
		System.out.printf("19-35: %.2lf%%\n",b2 / sum);
		System.out.printf("36-60: %.2lf%%\n",b3 / sum);
		System.out.printf("60??: %.2lf%%\n",b4 / sum);





	}
}

