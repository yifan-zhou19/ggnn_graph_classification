package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
			int i;
			int m;
			m = Math.sqrt(n) + 1;
			for (i = 2;i < m;i++)
			{
			   if (n % i == 0)
			   {
				   break;
			   }
			}
			if (i == m)
			{
				return (1);
			}
			else
			{
				return (0);
			}
	}
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		for (i = 6;i <= n;i = i + 2)
		{
		   for (k = 3;k <= n;k++)
		   {
			   if (sushu(k) == 1 && sushu(i - k) == 1)
			   {
				   System.out.printf("%d=%d+%d\n",i,k,i - k);
			   break;
			   }
		   }
		}
	}
}

