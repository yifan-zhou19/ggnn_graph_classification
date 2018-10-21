package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i = 1;
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
		int[] pg = new int[100];
		pg[n] = n + k;
		while (i != 0)
		{
			for (i = n - 1;i >= 0;i--)
			{
				if (pg[i + 1] % (n - 1) != 0)
				{
				break;
				}
				pg[i] = pg[i + 1] / (n - 1) * n + k;
			}
			//if(i==0) break;
			pg[n] += n;
		}
		System.out.printf("%d\n",pg[1]);
		return 0;
	}
}

