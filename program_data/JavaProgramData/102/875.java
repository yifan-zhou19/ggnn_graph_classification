package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sum1 = 0;
		int sum2 = 0;
		char[][] a = new char[40][7];
		String t1 = new String(new char[7]);
		double[] sg = new double[40];
		double t;
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg[i] = Double.parseDouble(tempVar3);
			}
		}


		for (i = 0;i < n;i++)
		{
			if (strcmp(a[i],"male") == 0)
			{
				sum1++;
			}
		}
		sum2 = n - sum1;




		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (strcmp(a[i],a[i + 1]) <= 0)
				{
					t1 = a[i],strcpy(a[i],a[i + 1]),strcpy(a[i + 1],t1);
					t = sg[i],sg[i] = sg[i + 1],sg[i + 1] = t;
				}
			}
		}



		for (j = 1;j < sum1;j++)
		{
			for (i = 0;i < sum1 - j;i++)
			{
				if (sg[i] >= sg[i + 1])
				{
					t = sg[i],sg[i] = sg[i + 1],sg[i + 1] = t;
				}
			}
		}

		for (j = 1;j < sum2;j++)
		{
			for (i = 0;i < sum2 - j;i++)
			{
				if (sg[sum1 + i] <= sg[sum1 + i + 1])
				{
					t = sg[sum1 + i],sg[sum1 + i] = sg[sum1 + i + 1],sg[sum1 + i + 1] = t;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			if (i != 0)
			{
				System.out.print(" ");
			}
			System.out.printf("%.2lf",sg[i]);
		}



		return 0;
	}

}

