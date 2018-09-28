package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int fun(int[] a, int[] b)
	{
		int min1 = 0;
		int min2 = 0;
		int max1 = n - 1;
		int max2 = n - 1;
		int count = 0;
		int sum = 0;
		while (count < n)
		{
			count++;
			if (a[max1] > b[max2])
			{
				max1--;
				max2--;
				sum += 200;
			}
			else if (a[max1] < b[max2])
			{
				sum -= 200;
				min1++;
				max2--;
			}
			else
			{
				if (a[min1] > b[min2])
				{
					sum += 200;
					min1++;
					min2++;
				}
				else if (a[min1] < b[max2])
				{
					sum -= 200;
					min1++;
					max2--;
				}
				else if (a[min1] == b[max2])
				{
					sum += 0;
					min1++;
					max2--;
				}
			}

		}
		return sum;
	}

	public static int Main()
	{
		int i;
		int[] a = new int[1005];
		int[] b = new int[1005];
		while (scanf("%d",n) && n != 0)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a,a + n);
			sort(b,b + n);
			System.out.printf("%d\n",fun(a, b));
		}
		return 0;
	}
}

