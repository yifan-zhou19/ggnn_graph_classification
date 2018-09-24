package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] shu = new int[number];
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			shu[0] = Integer.parseInt(tempVar);
		}
		for (n = 0;shu[n] != 0;n++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			shu[n + 1] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j <= n;j++)
			{
				if (shu[i] == 2 * shu[j])
				{
				k++;
				}
			}
		}
		if (k != 0)
		{
			k = k - 1;
		System.out.printf("%d",k);
		}
		else
		{
			System.out.printf("%d",k);
		}
	}
}

