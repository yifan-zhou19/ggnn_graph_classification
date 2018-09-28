package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] px;
		double[] py;
		px = new double[n];
		py = new double[n];
		int i;
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				px[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				py[i] = Double.parseDouble(tempVar3);
			}
		}
		double dis;
		double mdis;
		mdis = 0;
		int j;
		for (j = n - 1;j >= 0;j--)
		{
			for (i = j - 1;i >= 0;i--)
			{
				dis = (px[j] - px[i]) * (px[j] - px[i]) + (py[j] - py[i]) * (py[j] - py[i]);
				if (mdis <= dis)
				{
					mdis = dis;
				}
			}
		}
		mdis = Math.sqrt(mdis);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(px);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(py);
		System.out.printf("%.4f\n",mdis);
	}

}

