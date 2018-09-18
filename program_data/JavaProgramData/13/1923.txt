package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int b;
		int[] a = new int[20000];
		i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;i <= n - 1;i++)
		{
			if (i < n - 1)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			}
			else
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			}
		}
			for (j = 0;j < n;j++)
			{
			if (j == 0)
			{
				System.out.printf("%d",a[j]);
			}
			else
			{
				for (m = 0,b = 0;m < j;m++)
				{
					if (a[j] == a[m])
					{
						b++;
					}
				}
				if (b == 0)
				{
					System.out.printf(" %d",a[j]);
				}
			}
			}
		return 0;
	}


}

