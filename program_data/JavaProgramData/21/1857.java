package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[300];
	int n;
	int i;
	int min;
	int max;
	float sum = 0F;
	float ave;
	float mid;
	float mad;
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
		sum = sum + (float)a[i];
	}
	ave = sum / n;
	min = a[0];
	max = a[0];
	for (i = 0;i < n;i++)
	{
		if (a[i] < min)
		{
			min = a[i];
		}
		if (a[i] > max)
		{
			max = a[i];
		}
	}
	mid = ave - min;
	mad = max - ave;
	if (mid > mad)
	{
		System.out.printf("%d\n",min);
	}
	else if (mid < mad)
	{
		System.out.printf("%d\n",max);
	}
	else
	{
		System.out.printf("%d,%d\n",min,max);
	}
	}
}

