package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int count;
		int n;
		for (i = 0;i < 16;i++)
		{
			count = 0;
			n = 0;
			for (j = 0;j < 16;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j] = Integer.parseInt(tempVar);
				}
				if (a[0] == -1)
				{
					break;
				}
				if (a[j] == 0)
				{
					break;
				}
				count++;
			}
			if (a[0] == -1)
			{
				break;
			}
			for (j = 0;j < count;j++)
			{
				for (k = 0;k < count;k++)
				{
					if (a[k] == 2 * a[j])
					{
						n++;
					}
				}
			}
			System.out.printf("%d\n",n);
		}
		return 0;
	}
}

