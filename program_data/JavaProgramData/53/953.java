package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int j;
		int n;
		int i;
		int[] zs = new int[300];
		int[] nzs = new int[300];
		int k = 0;
		int[] jihao = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			jihao[i] = -100;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = n - 1;i > 0;i--)
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (zs[i] == zs[j])
				{
				jihao[i] = i;
				break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				if (i != jihao[i])
				{
					nzs[k] = zs[i];
					k++;
				}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",nzs[i]);
		}
		System.out.printf("%d",nzs[k - 1]);
	}
}

