package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5000];
		int[] b = new int[5000];
		int[] sz = new int[5000];
		int n;
		int N;
		int flag;
		int i;
		int max;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		flag = 1;
		for (i = 0;i < 5000;i++)
		{
			sz[i] = 0;
		}
		for (n = 0;n < N;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[n] = Integer.parseInt(tempVar3);
			}
			for (i = a[n];i < b[n];i++)
			{
				sz[i] = 1;
			}
		}
			  min = a[0];
			  max = b[0];
		for (n = 1;n < N;n++)
		{
			if (a[n] < min)
			{
				min = a[n];
			}
			if (b[n] > max)
			{
				max = b[n];
			}
		}
		for (i = min;i < max;i++)
		{
			if (sz[i] == 0)
			{
				System.out.print("no");
				flag = 0;
				break;
			}
		}
		if (flag != 0)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

