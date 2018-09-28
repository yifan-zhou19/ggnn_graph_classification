package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int s = 1;
		int max;
		int min;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		max = b[0];
		min = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i];j < b[i];j++)
			{
				c[j] = 1;
			}
		}
		for (j = min;j < max;j++)
		{
			if (c[j] != 1)
			{
				System.out.print("no\n");
				s = 0;
				break;
			}
		}
		if (s == 1)
		{
			System.out.printf("%d %d\n",min,max);
		}
	}
}

