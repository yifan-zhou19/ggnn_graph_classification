package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sza = new int[50000];
		int[] szb = new int[50000];
		int i;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sza[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				szb[i] = Integer.parseInt(tempVar3);
			}
		}
		int e;
		int f;
		int k;
		int a = 0;
		int b;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (sza[i] > sza[i + 1])
				{
		e = sza[i + 1];
		f = szb[i + 1];
		sza[i + 1] = sza[i];
		szb[i + 1] = szb[i];
		sza[i] = e;
		szb[i] = f;
				}
			}
		}
		max = szb[0];
		for (i = 1;i < n;i++)
		{
			if (sza[i] <= max)
			{
				if (max < szb[i])
				{
					max = szb[i];
				}
			}
			else
			{
				break;
			}
		}
		if (i < n)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d\n",sza[0],max);
		}
	return 0;



	}
}

