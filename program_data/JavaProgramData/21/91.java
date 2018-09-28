package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
	float[] a = new float[300];
	float[] b = new float[300];
	float averge;
	float sum = 0F;
	float max = 0F;
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
			a[i] = Float.parseFloat(tempVar2);
		}
	sum = sum + a[i];
	}
	averge = sum / n;
	for (i = 0;i < n;i++)
	{
		if (Math.abs(a[i] - averge) > max)
		{
		max = Math.abs(a[i] - averge);
	j = 1;
	b[j] = a[i];
	continue;
		}
	if (Math.abs(a[i] - averge) == max)
	{
		j++;
	b[j] = a[i];
	}
	}

	if (j == 1)
	{
		System.out.printf("%.0f",b[1]);
	}
	else
	{
		for (i = 1;i < j;i++)
		{
			System.out.printf("%.0f,",b[i]);
		}
	System.out.printf("%.0f",b[j]);
	}
	}




}

