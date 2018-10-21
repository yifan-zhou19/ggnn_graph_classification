package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int n;
		int[] a = new int[len];
		int[] b = new int[len];
		int i;
		int j;
		int[] jg = new int[len];
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[0] = Integer.parseInt(tempVar3);
		}
		max = min = a[0];
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Integer.parseInt(tempVar5);
			}
			if (b[i] > max)
			{
				max = b[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		for (i = min;i < max;i++)
		{
			jg[i] = 0;
		}
		for (j = 0;j < n;j++)
		{
			for (i = a[j];i < b[j];i++)
			{
				jg[i] = 1;
			}
		}
		for (i = min;i < max;i++)
		{
		if (jg[i] == 0)
		{
				System.out.print("no");
				break;
		}
		if (i == max - 1)
		{
				System.out.printf("%d %d",min,max);
		}

		}
		return 0;
	}

}

