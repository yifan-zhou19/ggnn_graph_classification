package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int tem;
		int[] a = new int[300];
		float ave;
		float[] b = new float[300];
		float max;
		float sum;
		sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[j];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] <= ave)
			{
			b[i] = ave - a[i];
			}
			else
			{
			b[i] = a[i] - ave;
			}
		}
		max = b[0];
		for (j = 1;j < n;j++)
		{
			if (max < b[j])
			{
			max = b[j];
			}
		}
		for (j = 0;j < n;j++)
		{
			if (b[j] == max)
			{
			   System.out.printf("%d",a[j]);
			   tem = j;
			   break;
			}
		}
		for (j = tem + 1;j < n;j++)
		{
		   if (b[j] == max)
		   {
			   System.out.printf(",%d",a[j]);
		   }
		}
		return 0;
	}
}

