package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int s4 = 0;
		int i;
		float p1;
		float p2;
		float p3;
		float p4;
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
		if (a[i] <= 18)
		{
			s1 += 1;
		}
		else if ((19 <= a[i]) && (a[i] <= 35))
		{
			s2 += 1;
		}
		else if ((36 <= a[i]) && (a[i] <= 60))
		{
			s3 += 1;
		}
		else if (a[i] >= 61)
		{
			s4 += 1;
		}
		}
		p1 = 100 * (float)s1 / n;
		p2 = 100 * (float)s2 / n;
		p3 = 100 * (float)s3 / n;
		p4 = 100 * (float)s4 / n;
		System.out.printf("1-18: %.2f%%\n",p1);
			System.out.printf("19-35: %.2f%%\n",p2);
				System.out.printf("36-60: %.2f%%\n",p3);
					System.out.printf("60??: %.2f%%\n",p4);
		return 0;
	}


}

