package <missing>;

public class GlobalMembers
{
	public static float jueduizhi(float x)
	{
		if (x < 0F)
		{
			x = -x;
		}
		return (x);
	}

	public static void Main()
	{
		int[] x = new int[300];
		int n;
		int i;
		int geshu = 1;
		float ave;
		float sum = 0.0F;
		float d;
		int p1;
		int p2;
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}


		for (i = 0;i < n;i++)
		{
			sum = sum + x[i];
		}
		ave = sum / n;

		p1 = x[0];
		p2 = x[0];
		d = jueduizhi(ave - x[0]);
		for (i = 1;i < n;i++)
		{
			if (jueduizhi(ave - x[i]) > d)
			{
				d = jueduizhi(ave - x[i]);
				p1 = x[i];
				p2 = p1;
			}
			else if (jueduizhi(ave - x[i]) == d)
			{
				p2 = x[i];
			}
		}
	if (p1 > p2)
	{
	System.out.printf("%d,%d",p2,p1);
	}
	else if (p1 < p2)
	{
	System.out.printf("%d,%d",p1,p2);
	}
	else
	{
		System.out.printf("%d",p1);
	}
	}


}

