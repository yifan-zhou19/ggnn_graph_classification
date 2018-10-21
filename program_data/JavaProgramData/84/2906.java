package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[50];
		int i;
		int k = 0;
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
		for (i = 0;i < n;i++)
		{
			if (a[k] < a[i])
			{
				k = i;
			}
		}
		System.out.printf("%d\n",a[k]);
		if (k == 0)
		{
			a[k] = a[1];
		}
		else
		{
			a[k] = a[0];
		}
		for (i = 0;i < n;i++)
		{
			if (a[k] < a[i])
			{
				k = i;
			}
		}
		System.out.printf("%d",a[k]);
	}



}

