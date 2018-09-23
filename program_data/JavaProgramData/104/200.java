package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] x = new int[12];
		int[] y = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y[0] = Integer.parseInt(tempVar2);
		}
		if (x[0] == 1 || y[0] == 0)
		{
			System.out.print("1\n");
		}
		else
		{
		for (i = 1;;i++)
		{
			x[i] = x[i - 1] / 2;
			if (x[i] == 1)
			{
				m = i;
				break;
			}
		}
		for (j = 1;;j++)
		{
			y[j] = y[j - 1] / 2;
			if (y[j] == 1)
			{
				n = j;
				break;
			}
		}
		for (i = m,j = n;i >= 0,j >= 0;i--,j--)
		{
			if (x[i] == y[j])
			{
				if (i == 0 || j == 0 || x[i - 1] != y[j - 1])
				{
					System.out.printf("%d\n",x[i]);
				}
				else
				{
					continue;
				}
			}
			else
			{
				break;
			}
		}
		}
	}
}

