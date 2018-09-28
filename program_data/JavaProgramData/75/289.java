package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i;
		int j;
		int n;
		int s = 0;
		int max = 0;
		char c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			if ((c = System.in.read()) == '\n')
			{
				n = (i + 1);
				break;
			}
		}
		for (j = 0;j <= 1000;j++)
		{
			for (i = 0;i <= (n - 1);i++)
			{
				if ((x[i] <= j) && (y[i]> j))
				{
					s++;
				}
			}
			if (s > max)
			{
				max = s;
			}
				s = 0;
		}
		System.out.printf("%d %d\n",n,max);
		return 0;
	}
}

