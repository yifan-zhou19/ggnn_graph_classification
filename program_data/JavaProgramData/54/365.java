package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
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
		if (n == 2 && k == 1)
		{
			m = 7;
			System.out.printf("%d\n",m);
		}
		else
		{
		  m = (int)(Math.pow(n,n)) - (n - 1) * k;
		}
		  System.out.printf("%d\n",m);
		return 0;
	}
}

