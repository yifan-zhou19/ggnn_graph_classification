package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum;
		int[] a = new int[300];
		int i;
		float[] b = new float[300];
		float ave;
		float c;
		float d;
		sum = 0;
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
		c = sum;
		d = n;
		ave = c / d;
		for (i = 0;i < n;i++)
		{
			if (a[i] > ave)
			{
				b[i] = a[i] - ave;
			}
			else
			{
				b[i] = ave - a[i];
			}
		}
		int flag;
		flag = 0;
		for (i = 0;i < n;i++)
		{
			if (b[i] > b[flag])
			{
				flag = i;
			}
		}
		int flags;
		flags = (-1);
		for (i = 0;i < n;i++)
		{
			if (b[i] == b[flag] && i != flag)
			{
				flags = i;
			}
		}
		if (flags == (-1))
		{
			System.out.printf("%d",a[flag]);
		}
		else
		{
			if (a[flag] > a[flags])
			{
				System.out.printf("%d,%d",a[flags],a[flag]);
			}
			else
			{
				System.out.printf("%d,%d",a[flag],a[flags]);
			}
		}
	}

}

