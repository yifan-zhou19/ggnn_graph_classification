package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int Main()
	{
		int k;
		int cout = new int(int,int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",n * cout(n, k) + k);
		return 0;
	}
	public static int cout(int m,int k)
	{
		int i;
		if (m == 1)
		{
			for (i = 1;;i++)
			{
				if ((i * Math.pow(n - 1,n - 1) - k) > 0)
				{
					;
				}
				{
					return Math.pow(n - 1,n - 1) - k;
					break;
			}
			}
		}
		else
		{
			return (n * cout(m - 1, k) + k) / (n - 1);
		}
	}

}

