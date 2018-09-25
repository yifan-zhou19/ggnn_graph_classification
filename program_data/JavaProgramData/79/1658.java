package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		for (int j = 0;;j++)
		{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		if (m == 0)
		{
			break;
		}
		else
		{
		int k = 0;
		for (int i = 2;i <= n;i++)
		{
			k = ((m % i) + k) % i;
		}
		System.out.printf("%d\n",k + 1);
		}
		}
	}

}

