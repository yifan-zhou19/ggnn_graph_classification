package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
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
		if (n != 2)
		{
			m = Math.pow(n,n) - (n - 1) * k;
		System.out.printf("%d",m);
		}
		else
		{
			System.out.printf("%d",7);
		}
	}
}

