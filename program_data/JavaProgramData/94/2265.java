package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int[] a = new int[1000];
		int n;
		int temp;
		int m = 0;
		int j = 0;
		char c = ',';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}

		for (int i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				a[j] = sz[i];
			j++;
			}
		for (int p = 0;p < j;p++)
		{
		for (int i = 0;i < j - 1 - p;i++)
		{
		  if (a[i] > a[i + 1])
		  {
				temp = a[i + 1];
			  a[i + 1] = a[i];
				a[i] = temp;
		  }
		}
		}

		}

	for (int i = 0;i < j;i++)
	{
		if (i < j - 1)
		{
		System.out.printf("%d%c",a[i],c);
		}
		else
		{
			System.out.printf("%d",a[i]);

		}
	}
	}


}

