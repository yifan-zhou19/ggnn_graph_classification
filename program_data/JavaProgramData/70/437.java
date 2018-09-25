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
		double[] p1 = new double[100];
		double[] p2 = new double[100];
		double dism = 0;
		double dis;
		for (int k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1[k] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p2[k] = Double.parseDouble(tempVar3);
			}
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1[i] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p2[i] = Double.parseDouble(tempVar5);
			}
			for (int j = i + 1;j < n;j++)
			{
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					p1[j] = Double.parseDouble(tempVar6);
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					p2[j] = Double.parseDouble(tempVar7);
				}
				dis = Math.sqrt(Math.pow(p1[i] - p1[j],2) + Math.pow(p2[i] - p2[j],2));
				if (dis > dism)
				{
					dism = dis;
				}
			}
		}
		System.out.printf("%.4lf",dism);
	}

}

