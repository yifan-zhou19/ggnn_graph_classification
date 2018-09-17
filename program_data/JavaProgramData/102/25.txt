package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] male = new double[50];
		double[] female = new double[50];
		double hit;
		double t;
		String str = new String(new char[10]);
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
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
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hit = Double.parseDouble(tempVar3);
			}
			if (str.charAt(0) == 'm')
			{
							 male[j] = hit;
							 j++;
			}
							 else
							 {
								  female[k] = hit;
								  k++;
							 }
		}
		for (i = 0;i < j;i++)
		{
			for (l = i;l < j;l++)
			{
				if (male[i] > male[l])
				{
				   t = male[i];
				   male[i] = male[l];
				   male[l] = t;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (l = i;l < k;l++)
			{
				if (female[i] < female[l])
				{
				   t = female[i];
				   female[i] = female[l];
				   female[l] = t;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		System.out.printf("%.2lf",male[j - 1]);
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2lf",female[i]);
		}
		return 0;
	}
}

