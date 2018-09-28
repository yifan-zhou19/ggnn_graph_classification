package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		float[] x = new float[100];
		float[] y = new float[100];
		float dis = 0F;
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
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (dis <= Math.sqrt(Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2)))
				{
					dis = Math.sqrt(Math.pow(x[j] - x[i],2) + Math.pow(y[j] - y[i],2));
				}
			}
		}
		System.out.printf("%.4f\n",dis);
		return 0;
	}

}

