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
		int max;
		int min;
		int t;
		int p;
		t = 0;
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

			for (i = 0,min = a[0];i < n;i++)
			{
				if (a[i] < min)
				{
						min = a[i];
				}
			}
			for (i = 0,max = b[0];i < n;i++)
			{
				if (b[i] > max)
				{
						max = b[i];
				}
			}
		p = 0;
		for (j = 0;j < n;j++)
		{
			if (a[j] == min && b[j] == max)
			{
				p = n;
				break;
			}
			for (i = 0,t = 0;i < n;i++)
			{
				if (i == j)
				{
					continue;
				}
				else if (a[j] == min)
				{
					if (a[i] <= b[j] != 0 && b[i] >= b[j])
					{
					t = t + 2;
					}
				}
				else if (b[j] == max)
				{
					if (b[i] >= a[j] != 0 && a[i] <= a[j])
					{
					t = t + 2;
					}
				}
				else
				{
					if (b[i] >= b[j] != 0 && a[i] <= a[j])
					{
						t = t + 2;
					}
					else if (b[i] >= b[j] != 0 && a[i] <= b[j] != 0 && a[i]> a[j])
					{
						t = t + 1;
					}
					else if (a[i] <= a[j] != 0 && b[i] >= a[j] != 0 && b[i] < b[j])
					{
						t = t + 1;
					}
				}
				if (t >= 2)
				{
					p += 1;
					break;
				}
			}

		}
		if (p != n)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

