package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int sum = 0;
		int flag = 0;
		float max = 0F;
		float p;
		int[] a = new int[300];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		p = (float)sum / n;
		//printf("%f\n",p);
		//printf("%d\n",fabs(a[0]-p));
		for (i = 0;i < n;i++)
		{
			if ((a[i] - p > max) || (p - a[i] > max))
			{
				max = Math.abs(a[i] - p);
			}
		}
		//printf("%f\n",max);
		for (i = 0;i < n;i++)
		{
			//printf("%f\n%f\n",fabs(a[i]-p)-max,pow(10,-6));
			if (Math.abs(Math.abs(a[i] - p) - max) < Math.pow(10,-6))
			{
				if (flag == 0)
				{
					System.out.printf("%d",a[i]);
					flag = 1;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
	}


}

