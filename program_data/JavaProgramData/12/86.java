package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int i;
		int j;
		int k;
		int n;
		for (;;)
		{
			n = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a < 0)
			{
				break;
			}
			else
			{
				for (i = 1; ;i++)
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
					else
					{
						continue;
					}
				}
				for (j = 0; j < i; j++)
				{
					for (k = 0; k < i; k++)
					{
						if (a[j] == 2 * a[k])
						{
							n += 1;
						}
						else
						{
							;
						}
					}
				}
				System.out.printf("%d\n", n);
			}
		}
	}
}

