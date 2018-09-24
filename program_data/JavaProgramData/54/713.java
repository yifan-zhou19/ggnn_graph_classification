package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		int k;
		int l = 1;
		int n;
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
		for (j = 1;l != 0;j++)
		{
			l = 0;
			m = j * n + k;
		for (i = 1;i < n;i++)
		{

			l = l + m % (n - 1);
			m = m / (n - 1) * (n) + k;

		}
		}
		System.out.printf("%d\n",m);
	}


}

