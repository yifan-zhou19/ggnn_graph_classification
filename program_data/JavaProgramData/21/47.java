package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int i = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		float avr;
		float sum = 0F;
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		avr = sum / n;
		float[] cha = new float[300];
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(a[i] - avr);
		}
		for (i = 0;i < n;i++)
		{
			int j;
			float x;
			int y;
			for (j = i + 1;j < n;j++)
			{
				if (cha[i] < cha[j])
				{
					x = cha[i];
					cha[i] = cha[j];
					cha[j] = x;
					y = a[i];
					a[i] = a[j];
					a[j] = y;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (cha[i] == cha[0])
			{
				System.out.printf(",%d",a[i]);
			}
		}
	}

}

