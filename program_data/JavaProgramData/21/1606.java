package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,a[300],i,j=0,sum=0,b[300];
		int n;
		int[] a = new int[300];
		int i;
		int j = 0;
		int sum = 0;
		int[] b = new int[300];
		double average;
		double ch;
		double max = 0;
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
		average = (double)sum / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] == average)
			{
				continue;
			}
			if (a[i] > average)
			{
				ch = a[i] - average;
			}
			if (a[i] < average)
			{
				ch = average - a[i];
			}
			if (ch == max)
			{
				j++;
				b[j] = a[i];
			}
			if (ch > max)
			{
				j = 0;
				max = ch;
				b[j] = a[i];
			}
		}
		for (i = 1;i < j;i++)
		{
			int k;
			int t;
			for (k = i;k > 0;k--)
			{
				if (b[k] < b[k - 1])
				{
					t = b[k];
					b[k] = b[k - 1];
					b[k - 1] = t;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i <= j;i++)
		{
			System.out.printf(",%d",b[i]);
		}
		return 0;
	}
}

