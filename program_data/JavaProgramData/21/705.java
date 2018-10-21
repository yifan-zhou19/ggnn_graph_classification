package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		float ave;
		float[][] a = new float[305][2];
		float[] t = new float[2];
		float sum = 0F;
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
				a[i][0] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i][0];
		}
		ave = sum / n;

		for (i = 0;i < n;i++)
		{
			a[i][1] = Math.abs(a[i][0] - ave);
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if ((a[j][1] > a[i][1]) || ((a[j][1] == a[i][1]) && (a[j][0] < a[i][0])))
				{
					t[0] = a[i][0];
					t[1] = a[i][1];
					a[i][0] = a[j][0];
					a[i][1] = a[j][1];
					a[j][0] = t[0];
					a[j][1] = t[1];
				}
			}
		}
			System.out.printf("%.0f",a[0][0]);
			for (i = 1;i < n;i++)
			{
				if (a[i][1] == a[0][1])
				{
					System.out.printf(",%.0f",a[i][0]);
				}
			}


	}

}

