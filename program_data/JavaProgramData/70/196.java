package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int i;
		double dis;
		double maxdis = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] px;
		double[] py;
		px = new double[n];
		py = new double[n];
		if (n >= 2)
		{
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
		}
		int j;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				dis = (px[j] - px[i]) * (px[j] - px[i]) + (py[j] - py[i]) * (py[j] - py[i]);
				if (maxdis < dis)
				{
					maxdis = dis;
				}
			}
		}
		maxdis = Math.sqrt(maxdis);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(px);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(py);
		System.out.printf("%.4f\n",maxdis);
		return 1;
	}
}

