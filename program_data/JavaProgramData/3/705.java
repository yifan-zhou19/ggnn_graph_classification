package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int k;
		int i;
		int j;
		int[] shu = new int[1000];
		int[][] y = new int[1000][1000];
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shu[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			y[i][j] = shu[i] + shu[j];
					 if (y[i][j] == k)
					 {
				count++;
					 }
			}
		}
		if (count == 0)
		{
		System.out.print("no");
		}
		else
		{
		System.out.print("yes");
		}
	}

}

