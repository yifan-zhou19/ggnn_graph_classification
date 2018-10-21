package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int j;
		int t;
		int max;
		int min;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
		min = a[0];
		max = b[0];
		j = 1;
		for (i = 1;i < n;i++)
		{
			if ((a[i] < min) && (b[i] >= min))
			{
				min = a[i];
				 j++;
			}
			else if ((b[i] > max) && (a[i] <= max))
			{
				max = b[i];
				j++;
			}
			else if ((a[i] == min) || (b[i] == max))
			{
				j++;
			}
			else if ((a[i] > min) && (b[i] < max))
			{
				j++;
			}
		}
		if (j == n)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}



}

