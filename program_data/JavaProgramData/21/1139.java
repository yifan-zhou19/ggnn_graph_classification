package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[305];
		int count = 0;
		int max;
		int min;
		double ave = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 1)
			{
				max = a[1];
				min = a[1];
			}
			if (max < a[i])
			{
				max = a[i];
			}
			if (min > a[i])
			{
				min = a[i];
			}
			ave += a[i];
		}
		ave /= n;
		if (ave - min > max - ave)
		{
			System.out.printf("%d",min);
		}
		else if (ave - min < max - ave)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.printf("%d,%d",min,max);
		}
	}
}

