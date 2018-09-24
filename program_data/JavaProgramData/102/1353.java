package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int f;
		int n;
		float[] male = new float[40];
		float[] female = new float[40];
		float temp;
		char[][] sex = new char[40][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		j = 0;
		m = 0;
		f = 0;
		temp = 0.00F;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			if (sex[i][0] == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					male[k] = Float.parseFloat(tempVar3);
				}
				k = k + 1;
				m = k;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					female[j] = Float.parseFloat(tempVar4);
				}
				j = j + 1;
				f = j;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (k = 1;k < m;k++)
			{
				if (male[k - 1] > male[k])
				{
					temp = male[k - 1];
					male[k - 1] = male[k];
					male[k] = temp;
				}
			}
		}
		for (i = 0;i < f;i++)
		{
			for (k = 1;k < f;k++)
			{
				if (female[k - 1] < female[k])
				{
					temp = female[k - 1];
					female[k - 1] = female[k];
					female[k] = temp;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (i = 0;i < f - 1;i++)
		{
			System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f",female[f - 1]);
		return 0;
	}



}

