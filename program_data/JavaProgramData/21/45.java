package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float h;
		float p;
		float q;
		float sum = 0.0F;
	  int i;
	  int n;
	  int[] a = new int[300];
	  int max;
	  int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");
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
		sum = sum + a[i];
	}
	h = sum / n;
	max = a[0];
	min = a[0];
	for (i = 0;i < n;i++)
	{
		if (a[i] > max)
		{
	max = a[i];
		}
	if (a[i] < min)
	{
	min = a[i];
	}
	}
	p = max - h;
	q = h - min;
	if (p > q)
	{
	System.out.printf("%ld",max);
	}
	if (p < q)
	{
	System.out.printf("%ld",min);
	}
	if (p == q)
	{
	System.out.printf("%ld,%ld",min,max);
	}
	}
}

