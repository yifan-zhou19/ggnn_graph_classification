package <missing>;

public class GlobalMembers
{
	public static int[][] rec = new int[10][10];
	public static int m;
	public static int n;
	public static int i;
	public static int j;
	public static int statej;
	public static int statejj;
	public static int min;
	public static int max;
	public static int flag;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					rec[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		flag = 0;
		for (i = 1;i <= m;i++)
		{
			max = 0;
			for (j = 1;j <= n;j++)
			{
				if (rec[i][j] > max)
				{
				max = rec[i][j];
				statej = j;
				}
			}
			min = 32767;
			for (j = 1;j <= m;j++)
			{
				if (rec[j][statej] < min)
				{
				min = rec[j][statej];
				statejj = j;
				}
			}
			if (i == statejj)
			{
				System.out.printf("%d+%d\n",i - 1,statej - 1);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}

	}
}

