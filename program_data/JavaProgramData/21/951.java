package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int sum = 0;
		int b1 = 0;
		int b2 = 0;
		float ave;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int a[300];
		int[] a = new int[300];
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
			sum += a[i];
		}
		ave = (float)sum / n;
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (Math.abs(a[i] - ave) >= max)
			{
				if (a[i] < ave)
				{
					max = Math.abs(a[i] - ave);
					b1 = i;
				}
				else
				{
					max = Math.abs(a[i] - ave);
					b2 = i;
				}
			}
		}
		if ((a[b2] - ave) > (ave - a[b1]))
		{
			System.out.printf("%d",a[b2]);
		}
		else if ((a[b2] - ave) < (ave - a[b1]))
		{
			System.out.printf("%d",a[b1]);
		}
		else
		{
			System.out.printf("%d,%d",a[b1],a[b2]);
		}
		return 0;
	}
}

