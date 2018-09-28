package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int s1;
		int s2;
		int s3;
		int s4;
		s1 = s2 = s3 = s4 = 0;
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
					sz[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				if (sz[i] <= 18)
				{
					s1++;
				}
				else if (sz[i] > 18 && sz[i] <= 35)
				{
					s2++;
				}
				else if (sz[i] >= 36 && sz[i] <= 60)
				{
					s3++;
				}
				else
				{
					s4++;
				}
			}
			System.out.printf("1-18: %.2lf%%\n",100 * (double)s1 / n);
			System.out.printf("19-35: %.2lf%%\n",100 * (double)s2 / n);
			System.out.printf("36-60: %.2lf%%\n",100 * (double)s3 / n);
			System.out.printf("60??: %.2lf%%\n",100 * (double)s4 / n);
		return 0;
	}

}

