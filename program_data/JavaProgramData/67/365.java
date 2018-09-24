package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] xg = new float[1000];
		float a;
		float b;
		float x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		x = (b / a) * 100;
			 for (i = 0;i < n - 1;i++)
			 {
					  float p;
					  float q;
					  float y;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				q = Float.parseFloat(tempVar5);
			}
			y = (q / p) * 100;
			xg[i] = y;
			 }
		for (i = 0;i < n - 1;i++)
		{
			if ((x - xg[i]) > 5)
			{
				System.out.print("worse\n");
			}
			else if ((xg[i] - x) > 5)
			{
				System.out.print("better\n");
			}
			else
			{
							   System.out.print("same\n");
			}
		}
		return 0;
	}
}

