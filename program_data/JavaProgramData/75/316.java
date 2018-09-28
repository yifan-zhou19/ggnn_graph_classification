package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int p = 0;
		int max = 0;
		int i;
		int j;
		int ren;
		int k;
		char c;
		i = 0;
		while (i < 1002)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c == '\n')
			{
				ren = i + 1;
				break;
			}
			i++;
		}
		i = 0;
		while (i < ren - 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			i++;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[ren - 1] = Integer.parseInt(tempVar5);
		}
		for (i = 0,j = 1;j < 1000;i++,j++)
		{
			for (k = 0;k < ren;k++)
			{
				if (a[k] <= i != 0 && b[k] >= j)
				{
					p++;
				}
			}
			if (p > max)
			{
				max = p;
			}
			p = 0;
		}
		System.out.printf("%d %d",ren,max);
		return 0;
	}

}

