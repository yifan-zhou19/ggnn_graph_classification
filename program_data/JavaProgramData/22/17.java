package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int i;
		int n = 1;
		int max1 = 0;
		int max2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (System.in.read() == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n++] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			max1 = a[i] > max1 != 0? a[i]:max1;
		}
		for (i = 0;i < n;i++)
		{
			max2 = (a[i] < max1 && a[i]> max2)? a[i]:max2;
		}
		if (max2 > 0)
		{
			System.out.printf("%d",max2);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}

}

