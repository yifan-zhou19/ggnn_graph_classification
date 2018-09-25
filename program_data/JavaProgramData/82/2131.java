package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int[] cz = new int[100];
		int[] pz = new int[100];
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				cz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int sum = 0;
		for (int i = 0;i < n;i++)
		{
			if (sz[i] >= 60 && sz[i] <= 90 && cz[i] >= 90 && cz[i] <= 140)
			{
				sum = sum + 1;
				pz[i] = sum;
			}
				else
				{
					sum = 0;
				}
					 pz[i] = sum;
		}
		a = pz[0];
		for (int i = 1;i < n;i++)
		{
			if (a < pz[i])
			{
			a = pz[i];
			}
		}
		System.out.printf("%d\n",a);
		return 0;
	}
}

