package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int[] sz = new int[1000];
		int[] dz = new int[1000];
		int a;
		int i;
		int[] sz3 = new int[1000];
		int b;
		a = 0;
		for (i = 0 ; i < k ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				dz[i] = Integer.parseInt(tempVar3);
			}

			if (sz[i] >= 90 && sz[i] <= 140 && dz[i] <= 90 && dz[i] >= 60)
			{
			a = a + 1;
			sz3[i] = a;
			}
			else
			{
				a = 0;
			}
		}
		b = sz3[0];
		for (i = 0 ; i < k ;i++)
		{

				if (sz3[i] > b)
				{
					b = sz3[i];
				}
		}


		System.out.printf("%d",b);
		return 0;
	}


}

