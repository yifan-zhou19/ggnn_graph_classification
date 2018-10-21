package <missing>;

public class GlobalMembers
{
	public static int compare(Object elem1, Object elem2)
	{
		return ((int)elem1 - (int)elem2);
	}
	public static int Main()
	{
		int n;
		int max;
		int sum;
		int i;
		int j;
		int[] a = new int[2000];
		int[] b = new int[1000];
		for (;;)
		{
			sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			}
			qsort(a,n,(Integer.SIZE / Byte.SIZE),compare);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),compare);
			for (i = 0;i < n;i++)
			{
			a[i + n] = a[i];
			}
			max = -n;
			for (i = 0;i < n;i++)
			{
				sum = 0;
				for (j = 0;j < n;j++)
				{
					if (a[i + j] < b[j])
					{
					sum--;
					}
					else if (a[i + j] > b[j])
					{
					sum++;
					}
				}
				if (sum >= max)
				{
				max = sum;
				}
			}
			max = max * 200;
			System.out.printf("%d\n",max);
		}
	}

}

