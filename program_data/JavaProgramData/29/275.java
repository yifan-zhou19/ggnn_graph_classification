package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int p = 1;
		int q = 1;
		int e;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= a;j++)
			{
			   e = p;
			   p = p + q;
			   q = e;
			   sum += (float)p / q;
			}
			System.out.printf("%.3f\n",(float)sum);
			sum = 0F;
			p = 1;
			q = 1;
		}
		return 0;
	}
}

