package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k;
		int[] a = new int[300];
		int[] m = new int[300];
		float[] b = new float[300];
		float aver = 0F;
		float max;
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
			aver = aver + a[i];
		}
		aver = aver / n;
		max = b[0] = Math.abs(a[0] - aver);
		for (i = 1;i < n;i++)
		{
			b[i] = Math.abs(a[i] - aver);
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				m[k++] = a[i];
			}
		}
		System.out.printf("%d",m[0]);
		for (i = 1;i < k;i++)
		{
			System.out.printf(",%d",m[i]);
		}
		System.out.print("\n");
	}


}

