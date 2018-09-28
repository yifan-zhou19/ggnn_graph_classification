package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a[1000], n, i, min, max;
		int[] a = new int[1000];
		int n;
		int i;
		int min;
		int max;
		double ave = 0;
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
		min = a[0];
		max = a[0];
		for (i = 0;i < n;i++)
		{
			ave += a[i];
			if (a[i] < min)
			{
				min = a[i];
			}
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		ave /= n;
		double d1 = ave - min;
		double d2 = max - ave;
		if (Math.abs(d1 - d2) < 1e-10)
		{
			System.out.printf("%d,%d", min, max);
		}
		else if (d1 > d2)
		{
			System.out.printf("%d", min);
		}
		else
		{
			System.out.printf("%d", max);
		}
	}

}

