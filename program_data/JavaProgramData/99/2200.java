package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int index;
		int[] a = new int[101];
		int[] age = {1, 19, 36, 61, 200};
		int[] s = new int[101];
		double[] b = new double[4];
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
			for (index = 0;index < 4;index++)
			{
				if (a[i] >= age[index] != 0 && a[i] < age[index + 1])
				{
					break;
				}
			}
			s[index] = s[index] + 1;
		}
		for (index = 0;index < 4;index++)
		{
			b[index] = (double)s[index] * 100 / n;
		}
		System.out.printf("1-18: %.2lf%%\n",b[0]);
		System.out.printf("19-35: %.2lf%%\n",b[1]);
		System.out.printf("36-60: %.2lf%%\n",b[2]);
		System.out.printf("60??: %.2lf%%\n",b[3]);
	}
}

