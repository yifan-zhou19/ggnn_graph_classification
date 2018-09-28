package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int min;
		int max;
		int tmp1 = 0;
		int tmp2 = 1;
		float k;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		min = a[0];
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = min;i < max;i++)
		{
			k = i + 0.5f;
			tmp1 = 0;
			for (j = 0;j < n;j++)
			{
				if (k >= a[j] != 0 && k <= b[j])
				{
					tmp1 = 1;
					break;
				}
			}
			if (tmp1 == 0)
			{
				tmp2 = 0;
				break;
			}
		}
		if (tmp2 == 1)
		{
			System.out.printf("%d %d\n",min,max);
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

