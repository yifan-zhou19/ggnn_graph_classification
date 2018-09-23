package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int sum = 0;
		int m = 0;
		int[] c = new int[2];
		int j = 0;
		float aver;
		float[] cha = new float[300];
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
			sum = sum + a[i];
		}
		aver = (float)sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] > aver)
			{
				cha[i] = (float)(a[i] - aver);
			}
			else
			{
				cha[i] = (float)(aver - a[i]);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] > max)
			{
				max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				c[j] = a[i];
				j++;
				m++;

			}
		}
		if (m == 1)
		{
			System.out.printf("%d\n",c[0]);
		}
		else
		{
			System.out.printf("%d,%d\n",c[0],c[1]);
		}
	}
}

