package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int N;
		int i;
		int[] n = new int[num];
		int[] c = new int[num];
		int[] m = new int[num];
		int[] sum = new int[num];
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		int y1 = 0;
		int y2 = 0;
		int y3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
			sum[i] = c[i] + m[i];
		}
		for (i = 0;i < N;i++)
		{
			if (sum[i] > x1)
			{
				x1 = sum[i];
				y1 = i;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sum[i] > x2 && sum[i] <= x1 != 0 && i != y1)
			{
				x2 = sum[i];
				y2 = i;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sum[i] > x3 && sum[i] <= x2 != 0 && i != y1 && i != y2)
			{
				x3 = sum[i];
				y3 = i;
			}
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",y1 + 1,x1,y2 + 1,x2,y3 + 1,x3);
	}

}

