package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int t;
		int s = 0;
		int j;
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
			for (j = i + 1;j < n;j++)
			{
				if (a[j] < a[i])
				{
					t = a[j];
					a[j] = a[i];
					a[i] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] % 2 == 1)
			{
				if (s == 0)
				{
					s = 1;
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}


}

