package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r;
		int c;
		int i;
		int j;
		int k;
		int[] p = new int[100];
		p = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		for (k = 0;k <= r + c - 2;k++)
		{
			for (i = 0;i <= k;i++)
			{
				if (i < r && (k - i) < c)
				{
					System.out.printf("%d\n",*(p[i] + k - i));
				}
			}
		}
	}


}

