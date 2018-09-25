package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i = 0;
		int max = 0;
		int max2 = 0;
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
			if (a[i] > max && a[i] > max2)
			{
				max2 = max;
				max = a[i];
			}
			else if (a[i] < max && a[i]> max2)
			{
				max2 = a[i];
			}
			i++;
		}
		System.out.printf("%d\n%d\n",max,max2);
		return 0;
	}



}

