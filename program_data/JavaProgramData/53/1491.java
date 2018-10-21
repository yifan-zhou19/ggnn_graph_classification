package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[1000];
		int n;
		int i;
		int j;
		j = 0;
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
			if (b[a[i]] == 0)
			{
				b[a[i]] = 1;
			}
			else
			{
				a[i] = 10000;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 10000)
			{
				j++;
				if (j == 1)
				{
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

