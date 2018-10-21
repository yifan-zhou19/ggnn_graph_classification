package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int t = 0;
		float s = 0F;
		float aver;
		float max;
		float temp;
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
		}
		for (i = 0;i < n;i++)
		{
			s = s + a[i];
		}
		aver = s / n;
		for (i = 0;i < n - 2;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		max = aver - a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < aver)
			{
				temp = aver - a[i];
			}
			else
			{
				temp = a[i] - aver;
			}
			if (temp > max)
			{
				max = temp;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < aver)
			{
				temp = aver - a[i];
			}
			else
			{
				temp = a[i] - aver;
			}
			if (temp == max)
			{
				t = t + 1;
				if (t == 1)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}
}

