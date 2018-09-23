package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char[][] zfc = new char[41][10];
		 double[] sz = new double[41];
		 double[] male = new double[41];
		 double[] female = new double[41];
		 double[] final = new double[41];
		 double e;
		int n;
		int i;
		int k;
		int num1 = 0;
		int num2 = 0;
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
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(zfc[i],"male") == 0)
			{
				male[num1] = sz[i];
				num1++;
			}
			else
			{
				female[num2] = sz[i];
				num2++;
			}
		 }
		for (k = 1;k <= num1;k++)
		{
			for (i = 0;i < num1 - k;i++)
			{
				if (male[i] > male[i + 1])
				{
					e = male[i + 1];
					male[i + 1] = male[i];
					male[i] = e;
				}
			}
		}
		for (k = 1;k <= num2;k++)
		{
			for (i = 0;i < num2 - k;i++)
			{
				if (female[i] > female[i + 1])
				{
					e = female[i + 1];
					female[i + 1] = female[i];
					female[i] = e;
				}
			}
		}
		for (i = 0;i < num1;i++)
		{
			final[i] = male[i];
		}
		for (i = 0;i < num2;i++)
		{
			final[n - 1 - i] = female[i];
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%.2lf ",final[i]);
			}
			else
			{
				System.out.printf("%.2lf",final[i]);
			}
		}

		return 0;
	}
}

