package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int n;
		int[] a = new int[100];
		int i;
		int max1;
		int max2;
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
		max1 = 0;
		max2 = 0;
		for (i = 0;i < n;i++)
		{
			if (max1 < a[i])
			{
				max1 = a[i];
				t = i;
			}
		}
		a[t] = 0;
		System.out.printf("%d\n",max1);
		for (i = 0;i < n;i++)
		{
			if (max2 < a[i])
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n",max2);
	}
}

