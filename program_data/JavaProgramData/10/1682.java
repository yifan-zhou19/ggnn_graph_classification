package <missing>;

public class GlobalMembers
{
	public static int[] rec = new int[26];
	public static int k;
	public static int sum;
	public static int i;
	public static int j;
	public static int[] n = new int[26];
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return (a);
		}
		else
		{
			return (b);
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				rec[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= k;i++)
		{
			n[i] = 1;
		}
		for (i = 2;i <= k;i++)
		{
			for (j = 1;j < i;j++)
			{
				if (rec[i] <= rec[j])
				{
					n[i] = max(n[i], n[j] + 1);
				}
			}
		}
		sum = 0;
		for (i = 1;i <= k;i++)
		{
			sum = max(sum, n[i]);
		}
		System.out.printf("%d",sum);
	}

}

