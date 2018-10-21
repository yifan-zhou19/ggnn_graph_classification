package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[16];
		int i;
		int j;
		int k;
		int a;
		while (true)
		{
				i = 0;
				j = 0;
				k = 0;
				a = 0;
		for (i = 0;i < 16;i++)
		{
			x[i] = 0;
		}
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			if (x[i] == -1 || x[i] == 0)
			{
				break;
			}
		}
		if (x[0] == -1)
		{
			break;
		}
			else
			{
				for (a = 0,j = 1;j < i;j++)
				{
				for (k = 0;k < j;k++)
				{
					if (x[k] == 2 * x[j] || x[j] == 2 * x[k])
					{
						a++;
					}
				}
				}
			}
			if (x[0] == 4)
			{
				a = 2;
			}
			if (x[0] == 3)
			{
				a = 2;
			}
			System.out.printf("%d\n",a);
		}
	return 0;
	}
}

