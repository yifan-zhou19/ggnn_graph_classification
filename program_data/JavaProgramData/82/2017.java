package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] ss = new int[100];
		int[] sz = new int[100];
		int a = 0;
		int e = 0;
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
		ss[n] = 0;
		sz[n] = 0;
		for (int i = 0;i < n + 1;i++)
		{
			if ((ss[i] >= 90) && (ss[i] <= 140) && (sz[i] >= 60) && (sz[i] <= 90))
			{
				a++;
			}
			else
			{
				if (a > e)
				{
					e = a;
				}
			   a = 0;


			}
		}
		System.out.printf("%d",e);
		return 0;
	}



}

