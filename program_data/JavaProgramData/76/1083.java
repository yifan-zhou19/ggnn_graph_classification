package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int c1;
		int c2;
		int min;
		int max;
		int t = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
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
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					c1 = a[j + 1];
					a[j + 1] = a[j];
					a[j] = c1;
					c2 = b[j + 1];
					b[j + 1] = b[j];
					b[j] = c2;
				}
			}
		}
		min = a[0];
		max = b[0];
		for (i = 1;i < n;i++)
		{
			if (max < a[i])
			{
				t++;
			}
			else if (max < b[i])
			{
				max = b[i];
			}
		}
		if (t > 0)
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

