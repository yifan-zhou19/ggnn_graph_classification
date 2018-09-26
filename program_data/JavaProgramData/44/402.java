package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int nnum;
		int abs;
		if (num < 0)
		{
			abs = -num;
		}
		else
		{
			abs = num;
		}
		int[] weishu = new int[20];
		int i = 1;
		while (abs != 0)
		{
			weishu[i] = abs % 10;
			abs = abs / 10;
			i++;
		}
		int nabs = 0;
		int j;
		for (j = 1;j < i;j++)
		{
			nabs = nabs * 10 + weishu[j];
		}
		if (num < 0)
		{
			nnum = -nabs;
		}
		else
		{
			nnum = nabs;
		}
		return nnum;
	}
	public static int Main()
	{
		int[] sz = new int[6];
		int[] xsz = new int[6];
		int k;
		for (k = 0;k < 6;k++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[k] = Integer.parseInt(tempVar);
			}
			xsz[k] = reverse(sz[k]);
		}
		for (k = 0;k < 6;k++)
		{
			System.out.printf("%d\n",xsz[k]);
		}
		return 0;
	}





}

