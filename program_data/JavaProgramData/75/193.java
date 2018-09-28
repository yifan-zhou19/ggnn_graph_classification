package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int i;
		int n;
		int t;
		int count1;
		int count = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x[i] = Integer.parseInt(tempVar);
			}
			if (System.in.read() == '\n')
			{
				n = i + 1;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			if (i < n - 1)
			{
				scanf(","); //????
			}
		}
		for (i = 0;i < n;i++)
		{
		   // printf("%d ",y[i]);
		for (t = 0;t < 1000;t++)
		{
			count1 = 0;
			for (i = 0;i < n;i++)
			{
				if ((x[i] <= t) && (y[i]> t))
				{
					count1++;
				   // printf(" i=%d ",i);
				}
			}
			if (count1 > count)
			{
				count = count1;
			}
		   // printf("%d\n",count1);
		}
		}
		System.out.printf("%d %d",n,count);
		return 0;
	}
}

