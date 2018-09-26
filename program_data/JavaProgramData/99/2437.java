package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		double first = 0;
		double second = 0;
		double third = 0;
		double fourth = 0;
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
		  if (a[i] < 19)
		  {
			first = first + 1;
		  }
			else if (a[i] < 36)
			{
			 second = second + 1;
			}
			else if (a[i] < 61)
			{
			third = third + 1;
			}
			else
			{
				fourth = fourth + 1;
			}

		}
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",first * 100 / n,second * 100 / n,third * 100 / n,fourth * 100 / n);
	}
}

