package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int nm = 0;
		int nf = 0;
		char[][] c = new char[50][10];
		float[] a = new float[50];
		float[] male = new float[50];
		float[] female = new float[50];
		float temp;
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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			if (c[i][0] == 'm')
			{
				male[nm] = a[i];
				nm++;
			}
			else
			{
				female[nf] = a[i];
				nf++;
			}
		}
		for (i = 0;i < nm - 1;i++)
		{
			for (j = 0;j < nm - 1 - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					temp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < nf - 1;i++)
		{
			for (j = 0;j < nf - 1 - i;j++)
			{
				if (female[j] < female[j + 1])
				{
					temp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < nm;i++)
		{
			System.out.printf("%.2f ",male[i]);
		}
		for (i = 0;i < nf - 1;i++)
		{
			System.out.printf("%.2f ",female[i]);
		}
		System.out.printf("%.2f",female[i]);
		return 0;
	}
}

