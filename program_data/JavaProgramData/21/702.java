package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int k = 0;
		double ave = 0.0;
		double max = 0.0;
		double x;
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
			ave += a[i];
		}
		ave /= n;
		for (i = 0;i < n;i++)
		{
			x = a[i] - ave;
			if (Math.abs(x) > Math.abs(max))
			{
				max = x;
				k = 0;
			}
			else if (Math.abs(x) == Math.abs(max))
			{
				k++;
			}
		}
		if (k == 0)
		{
			System.out.printf("%d",(int)(max + ave));
		}
		else
		{
			System.out.printf("%d,%d",(int)(ave - Math.abs(max)),(int)(ave + Math.abs(max)));
		}
	}

}

