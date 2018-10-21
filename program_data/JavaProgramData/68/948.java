package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		int z;
		int t;
		int k;
		k = (int)Math.sqrt(x);
		for (t = 2;t <= k;t++)
		{
			if (x % t == 0)
			{
				break;
			}
		}
			if (t > k)
			{
				z = 1;
			}
				else
				{
					z = 0;
				}
				return z;
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i;j = j + 2)
			{
				if (sushu(j) != 0 && sushu(i - j) != 0)
				{
				System.out.printf("%d=%d+%d\n",i,j,i - j);
				break;
				}
			}
		}
	}

}

