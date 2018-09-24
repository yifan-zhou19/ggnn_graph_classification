package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int[] max = new int[3];
		int[] a = new int[300];
		int sum = 0;
		float c;
		float d;
		float ma = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		c = (float)(sum) / (float)(n);
		for (i = 1;i <= n;i++)
		{
			d = (float)(a[i]) - c;
			if (d < 0F)
			{
				d = 0 - d;
			}
			if (d > ma)
			{
				ma = d;
				max[0] = a[i];
				max[1] = 0;
				max[2] = 0;
				j = 1;
			}
			else if (d == ma)
			{
				max[j] = a[i];
				j++;
			}
			else
			{
				j = j;
			}
		}
		System.out.printf("%d",max[0]);
			 if (max[1] != 0)
			 {
				 System.out.printf(",%d",max[1]);
			 }
	}
}

