package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int[] a = new int[10000];
		int max = 0;
		int may = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] > max)
			{
				max = a[i];
			}
			else if (a[i] > may)
			{
				may = a[i];
			}
			i++;
		}
		if (a[0] > may && a[0] < max)
		{
			may = a[0];
		}
		System.out.printf("%d\n%d\n",max,may);
	}
}

