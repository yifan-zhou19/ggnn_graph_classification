package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] qw = new int[1001];
		int[] tj = new int[1001];
		int[] tjif = new int[1001];
		int[] qwif = new int[1001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int wincount;
		wincount = 0;
		int tiecount;
		int r;
		while (n != 0)
		{
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[i] = Integer.parseInt(tempVar2);
				}
				tjif[i] = 0;
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[i] = Integer.parseInt(tempVar3);
				}
				qwif[i] = 0;
			}
			for (i = 1;i <= n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
				  if (tj[i] > tj[j])
				  {
					  t = tj[i];
					  tj[i] = tj[j];
					  tj[j] = t;
				  }
				}
			}
			 for (i = 1;i <= n;i++)
			 {
				for (j = i + 1;j <= n;j++)
				{
				  if (qw[i] > qw[j])
				  {
					  t = qw[i];
					  qw[i] = qw[j];
					  qw[j] = t;
				  }
				}
			 }
			 /*intf("now the turn is:\n");
			 for (i=1;i<=n;i++) printf("%d ",tj[i]);
			 printf("\n");
			 for (i=1;i<=n;i++) printf("%d ",qw[i]);
			 printf("\n");*/
			 for (i = 1;i <= n;i++)
			 {
				for (j = n;j > 0;j = j - 1)
				{
					if ((qw[j] < tj[i]) && (qwif[j] == 0))
					{
						tjif[i] = 1;
						qwif[j] = 1;

						break;
					}
				}
			 }
			wincount = 0;
			for (k = 1;k <= n;k++)
			{
				if (tjif[k] == 1)
				{
					wincount++;
				}

			}
			tiecount = 0;
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
				  if ((tj[i] == qw[j]) && (qwif[j] == 0) && (tjif[i] == 0))
				  {
					  tjif[i] = 1;
					  qwif[j] = 1;
					  tiecount++;
				  }
				}
			}
			r = 200 * wincount - 200 * (n - wincount - tiecount);
			System.out.printf("%ld\n",r);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
}

