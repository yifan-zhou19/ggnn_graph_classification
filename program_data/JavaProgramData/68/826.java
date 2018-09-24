package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int a;
		int n;
		int i;
		int m;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 6;k <= n;k++,k++)
		{
			for (j = 3;j <= k / 2;j++,j++)
			{
			if (sushu(j) == 1)
			{
				   m = k - j;
			}
				if (sushu(m) == 1)
				{
					System.out.printf("%d=%d+%d\n",k,j,m);
				break;
				}
			}
		}
	}
		public static int sushu(int a)
		{
			int i;
			for (i = 3;i <= Math.sqrt(a);i++,i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i > Math.sqrt(a))
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}





}

