package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int k;
		int max1 = 0;
		int max2 = -1;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (System.in.read() != ',')
			{
				break;
			}
		}
		for (k = 0;k <= i;k++)
		{
			if (a[k] > max1)
			{
				max1 = a[k];
			}
		}
		for (k = 0;k <= i;k++)
		{
			if (a[k] < max1 && a[k]> max2)
			{
				max2 = a[k];
			}
		}
		if (max2 > -1)
		{
			System.out.printf("%d\n",max2);
		}
		else
		{
			System.out.print("No\n");
		}
	}
}

