package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int k;
		int s;
		int t;
		int p;
		for (k = 1;;k++)
		{
			p = 0;
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
				for (i = 1;i < 17;i++)
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
				for (s = 0;s < i;s++)
				{
					for (t = 0;t < i;t++)
					{
					if (a[t] == 2 * a[s])
					{
							p = p + 1;
							break;
					}
					}
				}
				System.out.printf("%d\n",p);
			}
		}
		return 0;
	}
}

