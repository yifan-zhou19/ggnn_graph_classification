package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int num;
		int tempi;
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		float[] d = new float[100];
		float tempd;
		int[] dp1 = new int[100];
		int[] dp2 = new int[100];
		//scan the numbers
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}

		num = -1;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				num++;
				d[num] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				dp1[num] = i;
				dp2[num] = j;
			}
		}


		num++;
		for (i = 0;i < num - 1;i++)
		{
			for (j = i + 1;j < num;j++)
			{
				if (d[j] > d[i])
				{
					//swap d
					tempd = d[j];
					d[j] = d[i];
					d[i] = tempd;
					//swap dp1
					tempi = dp1[i];
					dp1[i] = dp1[j];
					dp1[j] = tempi;
					//swap dp2
					tempi = dp2[i];
					dp2[i] = dp2[j];
					dp2[j] = tempi;
				}
				if (d[j] == d[i] && (dp1[j] < dp1[i] || dp1[j] == dp1[i] && dp2[j] < dp2[i]))
				{

					tempd = d[j];
					d[j] = d[i];
					d[i] = tempd;

					tempi = dp1[i];
					dp1[i] = dp1[j];
					dp1[j] = tempi;

					tempi = dp2[i];
					dp2[i] = dp2[j];
					dp2[j] = tempi;
				}
			}
		}

		for (i = 0;i < num;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[dp1[i]],y[dp1[i]],z[dp1[i]],x[dp2[i]],y[dp2[i]],z[dp2[i]],d[i]);
		}

	}


}

