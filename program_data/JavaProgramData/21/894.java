package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] a = new float[300];
		float[] b = new float[2];
		float aver;
		float max;
		float e = 0.001F;
		int i;
		int j = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Float.parseFloat(tempVar2);
		}
		aver = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			aver = aver + a[i];
		}
		aver = aver / n;

		max = Math.abs(aver - a[0]);
		for (i = 1;i < n;i++)
		{
			if (Math.abs(aver - a[i]) > max)
			{
				max = Math.abs(aver - a[i]);
			}
		}

		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - aver) > max - e && Math.abs(a[i] - aver) < max + e)
			{
				b[j] = a[i];
				j++;
			}
		}

		if (j == 1)
		{
			System.out.printf("%.0f",b[0]);
		}
		else
		{
			if (b[0] < b[1])
			{
				System.out.printf("%.0f,%.0f",b[0],b[1]);
			}
			else
			{
				System.out.printf("%.0f,%.0f",b[1],b[0]);
			}
		}
	}
}

