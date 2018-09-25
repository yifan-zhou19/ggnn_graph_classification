package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int y;
		int i;
		float m;
		float n;
		float p;
		float q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		m = 0F;
		n = 0F;
		p = 0F;
		q = 0F;
		for (i = 0;i < y;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a <= 18)
			{
				m++;
			}
			else if (a <= 35 && a>18)
			{
				n++;
			}
			else if (a > 35 && a <= 60)
			{
				p++;
			}
			else if (a > 60)
			{
				q++;
			}
		}
		System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%\n",m * 100 / y,n * 100 / y,p * 100 / y,q * 100 / y);
		return 0;
	}
}

