package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] s = new int[100];
		double q;
		double w;
		double e;
		double r;
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
			if (1 <= s[i] != 0 && s[i] < 19)
			{
				a++;
			}
			if (19 <= s[i] != 0 && s[i] < 36)
			{
				b++;
			}
			if (36 <= s[i] != 0 && s[i] < 61)
			{
				c++;
			}
			if (61 <= s[i])
			{
				d++;
			}
		}
		q = (double)a / n * 100;
		w = (double)b / n * 100;
		e = (double)c / n * 100;
		r = (double)d / n * 100;
		System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%\n",q,w,e,r);
	}
}

