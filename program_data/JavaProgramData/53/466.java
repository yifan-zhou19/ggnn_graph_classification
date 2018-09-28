package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[301];
		int i = 0;
		int j;
		int f;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0,f = 1;j < i;j++)
			{
				if (a[j] == a[i])
				{
					f = 0;
				}
			}
			if (f == 1)
			{
				i++;
			}
			k++;

		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%d,",a[j]);
		}
		System.out.printf("%d",a[i - 1]);
	}


}

