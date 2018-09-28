package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] ss = new int[100];
		int[] sz = new int[100];
		int[] time = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ss[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int h = 0;
		int j = 0;
		for (int k = 0;k < n;k++)
		{
			if ((ss[k] >= 90) && (ss[k] <= 140) && (sz[k] >= 60) && (sz[k] <= 90))
			{
				h++;
			}
			else
			{
				time[j] = h;
				j++;
				h = 0;
			}
		}
		int e = 0;
		for (int l = 0;l < j;l++)
		{
			if (e < time[l])
			{
				e = time[l];
			}
		}
		if (e >= h)
		{
			   System.out.printf("%d",e);
		}
		else
		{
			   System.out.printf("%d",h);
		}
		return 0;
	}

}

