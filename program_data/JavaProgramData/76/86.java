package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int max = 0;
		int min = 10000;
		int c;
		int d;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a[i] = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							b[i] = Integer.parseInt(tempVar3);
						}
						if (a[i] <= min)
						{
						  min = a[i];
						}
						if (b[i] >= max)
						{
						  max = b[i];
						}
		}
		for (int p = 0;p < n;p++)
		{
				c = 1;
				d = 1;
				for (int q = 0;q < n;q++)
				{
						if (q != p)
						{
								if (a[p] >= a[q] != 0 && a[p] <= b[q])
								{
								c = 0;
								}
								if (b[p] >= a[q] != 0 && b[p] <= b[q])
								{
								d = 0;
								}
						}
				}
				if ((c == 1 && a[p] != min) || (d == 1 && b[p] != max))
				{
				  k++;
				}
		}
				if (k != 0)
				{
				  System.out.print("no");
				}
				else
				{
					System.out.printf("%d %d",min,max);
				}
		return 0;
	}
}

