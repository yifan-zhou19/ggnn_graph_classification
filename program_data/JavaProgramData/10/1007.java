package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100];
	public static int[] max = new int[100];
	public static int Main()
	{
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				max[i] = 1;
			}
			else
			{
				for (j = 1,c = 0;j <= i - 1;j++)
				{
					if (a[j] < a[i])
					{
						;
					}
					else
					{
						if (c < max[j])
						{
							c = max[j];
						}
					}
				}
				max[i] = c + 1;
			}
		}
		for (i = 1,c = max[1];i <= n;i++)
		{
			if (c < max[i])
			{
				c = max[i];
			}
		}
		System.out.printf("%d",c);
	}
}

