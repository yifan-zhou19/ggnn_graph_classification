package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int min1;
		int min2;
		int max1;
		int max2;
		int i;
		int num;
		while (scanf("%d", n) && n != 0)
		{
			min1 = 0;
			min2 = 0;
			max1 = n - 1;
			max2 = n - 1;
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
			count = 0;
			num = 0;
			while (++count != 0)
			{
				if (count == n + 1)
				{
					break;
				}
				if (a[max1] > b[max2])
				{
					num += 200;
					max1--;
					max2--;
				}
				else if (a[max1] < b[max2])
				{
					num -= 200;
					min1++;
					max2--;
				}
				else
				{
					if (a[min1] > b[min2])
					{
						min1++;
						min2++;
						num += 200;
					}
					else if (a[min1] == b[max2])
					{
						min1++;
						max2--;
					}
					else
					{
						min1++;
						max2--;
						num -= 200;
					}
				}
			}
			System.out.printf("%d\n",num);
		}
		return 0;
	}
}

