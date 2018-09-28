package <missing>;

public class GlobalMembers
{

/*
n??????m????
?????kingmonkey(n,m)=(kingmonkey(n-1,m)+m)%n
?????king(n-1,m)?????????
*/
	public static int kingmonkey(int n, int m)
	{
		if (n == 1)
		{
			return 1;
		}
		/*??
		if(monkey[n]==0)
		{
			monkey[n]=(kingmonkey(n-1,m)+m+1)%n;
		}
		*/
		else
		{
			int tmp = (kingmonkey(n - 1, m) + m);
			if ((tmp % n) == 0)
			{
				tmp = n;
			}
			else if (tmp > n)
			{
				tmp = tmp % n;
			}
			return tmp;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int result;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if ((n == 0) && (m == 0))
			{
				break;
			}
			else
			{
				result = kingmonkey(n, m);
				System.out.printf("%d\n",result);
			}
		}
		return 0;
	}
}

