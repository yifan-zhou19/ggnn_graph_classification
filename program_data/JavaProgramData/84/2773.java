package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int m;
		int i;
		int max1;
		int max2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		max1 = a[0];
		for (i = 0;i < m;i++)
		{
			if (a[i] > max1)
			{
				max1 = a[i];
			}
		}
		max2 = a[0];
		for (i = 0;i < m;i++)
		{
			if (a[i] > max2 && a[i] != max1)
			{
				max2 = a[i];
			}
		}
		System.out.printf("%d\n%d",max1,max2);
	}




}

