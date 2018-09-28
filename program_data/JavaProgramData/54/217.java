package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int x;
		int y;
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
		x = Math.pow(n,n);
		y = Math.pow(n - 1,n);
		for (i = 1;;i++)
		{
			if ((i + k * (n - 1)) % y == 0)
			{
				break;
			}
		}
		m = (i + k * (n - 1)) / y * x - k * (n - 1);
		System.out.printf("%d",m);
	}

}

