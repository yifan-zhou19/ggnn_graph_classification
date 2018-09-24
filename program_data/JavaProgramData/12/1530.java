package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int n;
		int i;
		int j;
		int k;
		while (true)
		{
			n = 0;
			for (i = 0;i < 16;i++)
			{
				a[i] = 0;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] == -1)
			{
				break;
			}
			else
			{
				for (i = 1;i < 16;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					if (a[i] == 0)
					{
						break;
					}
				}
				j = i;
				for (i = 0;i < j - 1;i++)
				{
					for (k = i + 1;k < j;k++)
					{
						if (a[k] == 2 * a[i] || a[i] == 2 * a[k])
						{
							n++;
						}
					}
				}
				System.out.printf("%d\n",n);
			}
		}

	}
}

