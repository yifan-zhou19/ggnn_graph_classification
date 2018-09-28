package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int max;
		int imax;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			switch (i)
			{
				case 1:
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						imax = Integer.parseInt(tempVar2);
					}
					break;
				case 2:
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a = Integer.parseInt(tempVar3);
					}
						if (a > imax)
						{
							max = imax;
							a = imax;
						}
						else
						{
							max = a;
						}
						break;
				default:
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a = Integer.parseInt(tempVar4);
					}
						if (a >= imax)
						{
							max = imax;
							imax = a;
						}
						else if (a < imax && a >= max)
						{
							max = a;
						}
			}
		}
		System.out.printf("%d\n%d\n",imax,max);
		return 0;
	}

}

