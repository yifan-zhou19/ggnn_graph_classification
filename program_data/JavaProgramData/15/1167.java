package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int ai;
		int aj;
		int bi;
		int bj;
		int ans;
		int x;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ai = n;
		aj = n;
		bi = -1;
		bj = -1;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				if (x == 0)
				{
					if (i < ai)
					{
						ai = i;
					}
					if (i > bi)
					{
						bi = i;
					}
					if (j < aj)
					{
						aj = j;
					}
					if (j > bj)
					{
						bj = j;
					}
				}
			}
		}

		ans = (bi - ai - 1) * (bj - aj - 1);

		System.out.printf("%d\n",ans);


		return 0;
	}


}

