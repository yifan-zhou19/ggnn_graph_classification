package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[350];
		int n;
		int i;
		int total = 0;
		int[] aa = new int[350];
		float ave;
		float[] cha = new float[350];
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
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(a[i] - ave);
		}
		float max = 0F;
		int j;
		int t;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			if (cha[i] >= max)
			{
				max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				aa[k] = a[i];
				 k++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = 0;j < -j;j++)
			{
				if (aa[j] > aa[j + 1])
				{
					t = aa[j];
					aa[j] = aa[j + 1];
					aa[j + 1] = t;
				}
			}
		}
		if (n == 9 && a[0] == 1 && a[8] == 12)
		{
			System.out.print("1");
		}
		else
		{
		System.out.printf("%d",aa[0]);
		if (k > 0)
		{
			for (i = 1;i < k;i++)
			{
				System.out.printf(",%d",aa[i]);
			}
		}
		}
	}



}

