package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,a[300],i,sum=0,max,min;
		int n;
		int[] a = new int[300];
		int i;
		int sum = 0;
		int max;
		int min;
		float m;
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
		m = (float)sum / n;
		max = a[0];
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
			if (min > a[i])
			{
				min = a[i];
			}
		}
		if (((float)max - m) > (m - (float)min))
		{
			System.out.printf("%d",max);
		}
		else if (((float)max - m) < (m - (float)min))
		{
			System.out.printf("%d",min);
		}
		else if (((float)max - m) == (m - (float)min))
		{
			System.out.printf("%d,%d",min,max);
		}
	}
}

