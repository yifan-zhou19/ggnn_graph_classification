package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] s = new int[1000];
		int i;
		int a;
		int b;
		int c;
		int d;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
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
			if (s[i] >= 1 && s[i] <= 18)
			{
				a++;
			}
			else if (s[i] >= 19 && s[i] <= 35)
			{
				b++;
			}
			else if (s[i] > 35 && s[i] <= 60)
			{
				c++;
			}
			else if (s[i] > 60)
			{
				d++;
			}
		}
		System.out.printf("1-18: %.2lf%%\n",100 * (double)a / n);
		System.out.printf("19-35: %.2lf%%\n",100 * (double)b / n);
		System.out.printf("36-60: %.2lf%%\n",100 * (double)c / n);
		System.out.printf("60??: %.2lf%%\n",100 * (double)d / n);
		return 0;

	}

}

