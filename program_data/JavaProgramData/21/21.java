package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int max;
		int min;
		int p;
		float av;
		float sum = 0F;
		float[] a = new float[100];
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
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		av = sum / n;
		max = min = a[0];
		for (i = 1;i < n;i++)
		{
			max = a[i] > max != 0?a[i]:max;
			min = a[i] > min != 0?min:a[i];
		}
		p = max + min;
		if (2 * av == p)
		{
			System.out.printf("%d,%d\n",min,max);
		}
		else if (2 * av > p)
		{
			System.out.printf("%d\n",min);
		}
		else if (2 * av < p)
		{
			System.out.printf("%d\n",max);
		}
	}
}

