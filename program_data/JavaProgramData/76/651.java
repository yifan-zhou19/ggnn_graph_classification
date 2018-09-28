package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int i;
		int j;
		int min;
		int max;
		int sum;
		int s;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		min = a[0];
		for (i = 1;i < n;i++)
		{
			if (min > a[i])
			{
				min = a[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (min > b[i])
			{
				min = b[i];
			}
		}
		double d;
		s = 0;
		for (d = min + 0.1;d < max;d++)
		{
			sum = 0;
			for (j = 0;j < n;j++)
			{
				if (d >= a[j] != 0 && d <= b[j])
				{
				sum++;
				}
			}
			if (sum == 0)
			{
			System.out.print("no\n");
			break;
			}
			else
			{
			s++;
			}
		}
		if (s == (max - min))
		{
		System.out.printf("%d %d",min, max);
		}
		return 0;
	}
}

