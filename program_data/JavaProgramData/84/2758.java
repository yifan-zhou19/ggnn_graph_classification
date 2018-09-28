package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int max2;
		int n;
		int i;
		int[] a = new int[100];
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
		}
		for (i = 0,max = max2 = a[0];i < n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max2 < a[i] && a[i] < max)
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n%d",max,max2);
		System.in.read();
		System.in.read();
	}

}

