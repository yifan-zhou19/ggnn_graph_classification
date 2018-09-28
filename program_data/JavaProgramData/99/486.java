package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[100];
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		double n1;
		double n2;
		double n3;
		double n4;
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
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] < 19)
			{
				a += 1;
			}
			else if (s[i] > 18 && s[i] < 36)
			{
				b += 1;
			}
			else if (s[i] > 35 && s[i] < 61)
			{
				c += 1;
			}
			else if (s[i] > 60)
			{
				d += 1;
			}
		}
		n1 = (double)a * 100 / n;
		n2 = (double)b * 100 / n;
		n3 = (double)c * 100 / n;
		n4 = (double)d * 100 / n;
		System.out.printf("1-18: %.2lf%%\n",n1);
		System.out.printf("19-35: %.2lf%%\n",n2);
		System.out.printf("36-60: %.2lf%%\n",n3);
		System.out.printf("60??: %.2lf%%",n4);
		return 0;
	}
}

