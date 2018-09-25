package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] x = new int[1005];
		int[] y = new int[1005];
		int mark;
		int max = 0;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[0] = Integer.parseInt(tempVar);
		}
		i = 1;
		while ((c = System.in.read()) == ',')
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y[0] = Integer.parseInt(tempVar3);
		}
		i = 1;
		while ((c = System.in.read()) == ',')
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y[i] = Integer.parseInt(tempVar4);
			}
			i++;
		}
		n = i;
		for (i = 0;i < 1000;i++)
		{
			mark = 0;
			for (j = 0;j < n;j++)
			{
				if (i >= x[j] != 0 && i < y[j])
				{
				mark++;
				}
			}
			max = (max > mark)?max:mark;
		}
		System.out.printf("%d %d",n,max);
	}

}

