package <missing>;

public class GlobalMembers
{
	public static int sushu(int k)
	{
		int i;
		for (i = 2;i <= Math.sqrt(k);i++)
		{
		if (k % i == 0)
		{
			break;
		}
		}
		if (i <= Math.sqrt(k))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		n = (n % 2 == 0)?n:n - 1;
		for (m = 6;m <= n;m += 2)
		{
			for (i = 3;i <= m - 1;i++)
			{
		  if (sushu(i) != 0 && sushu(m - i) != 0)
		  {
		  System.out.printf("%d=%d+%d",m,i,m - i);
		  break;
		  }
			}
		  if (m < n)
		  {
			  System.out.print("\n");
		  }
		}
	}
}

