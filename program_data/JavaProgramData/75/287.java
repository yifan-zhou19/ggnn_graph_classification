package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] mark = new int[1000];
		char c;
		int i = 0;
		int j = 0;
		int num;
		int max;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		while (c = System.in.read() == ',')
		{
			i = i + 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[j] = Integer.parseInt(tempVar3);
		}
		while (c = System.in.read() == ',')
		{
			j = j + 1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}
		num = j + 1;
		for (k = 0;k < 1000;k++)
		{
			for (i = 0;i < num;i++)
			{
				if (k >= a[i] != 0 && k < b[i])
				{
					mark[k] = mark[k] + 1;
				}
			}
		}
		max = mark[0];
		for (k = 0;k < 1000;k++)
		{
			if (mark[k] > max)
			{
				max = mark[k];
			}
		}
		System.out.printf("%d %d",num,max);
		return 0;
	}

}

