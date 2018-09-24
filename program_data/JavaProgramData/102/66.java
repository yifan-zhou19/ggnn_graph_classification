package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count1 = 0;
		int count2 = 0;
		char[][] zf = new char[40][7];
		char q;
		double[] sg = new double[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		count2 = n - 1;
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				zf[i] = tempVar3.charAt(0);
			}
			int a = String.valueOf(zf[i]).length();
			if (a == 4)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sg[count1] = Double.parseDouble(tempVar4);
				}
				count1++;
			}
			else
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					sg[count2] = Double.parseDouble(tempVar5);
				}
				count2--;
			}
		}
		int k;
		int m;
		int d;
		int f;
		double e = 0.0;
		double c = 0.0;
		for (k = 0;k < count1 - 1;k++)
		{
			for (m = k + 1;m < count1;m++)
			{
				if (sg[m] < sg[k])
				{
					e = sg[k];
					sg[k] = sg[m];
					sg[m] = e;
				}
			}
		}
		for (d = count2 + 1;d < n;d++)
		{
			for (f = k + 1;f < n;f++)
			{
				if (sg[f] < sg[d])
				{
					c = sg[d];
					sg[d] = sg[f];
					sg[f] = c;
				}
			}
		}
		System.out.printf("%.2lf",sg[0]);
		for (int s = 1;s < n;s++)
		{
			System.out.printf(" %.2lf",sg[s]);
		}
		return 0;
	}
}

