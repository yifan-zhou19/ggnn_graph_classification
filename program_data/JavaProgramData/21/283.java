package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] c = new int[300];
		int n;
		int i;
		int k = 0;
		int m;
		float ave;
		float total = 0F;
		float cha;
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
			total = total + a[i];
		}
		ave = total / n;
		cha = Math.abs(a[0] - ave);
		c[0] = a[0];
		for (i = 1;i < n;i++)
		{
			if (Math.abs(a[i] - ave) > cha)
			{
				cha = Math.abs(a[i] - ave);
				c[0] = a[i];
				m = a[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - cha) < 0.000001 && m != a[i])
			{
				k++;
				c[k] = a[i];
			}
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i <= k;i++)
		{
			System.out.printf(",%d",c[k]);
		}


	}
}

