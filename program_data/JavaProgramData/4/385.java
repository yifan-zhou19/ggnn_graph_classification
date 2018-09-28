package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int line;
		int rownow;
		int linenow;
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			line = Integer.parseInt(tempVar2);
		}
		for (j = 0;j <= row * line-1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= row + line-1;i++)
		{
			rownow = 0;
			linenow = i - rownow;
			for (;rownow <= row - 1 && linenow >= 0;rownow++, linenow--)
			{
				if (linenow >= line)
				{
					continue;
				}
				n = rownow * line + linenow;
				System.out.printf("%d\n",a[n]);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			j = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

