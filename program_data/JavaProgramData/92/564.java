package <missing>;

public class GlobalMembers
{
		public static int compare(Object elem1, Object elem2)
		{
		return*((int)(elem2)) - (int)(elem1);
		}

	public static int Main()
	{
	int j;
	for (j = 1;;j++)
	{



		int n;
		int count = 0;
		int tout;
		int weit;
		int touq;
		int weiq;
		int[] t = new int[1010];
		int[] q = new int[1010];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		else
		{
		tout = 0,weit = n - 1,touq = 0,weiq = n - 1;
		}
		   for (int i = 0;i <= n - 1;i++)
		   {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t[i] = Integer.parseInt(tempVar2);
			}
		   }
		   for (int i = 0;i <= n - 1;i++)
		   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		   }

		qsort(t,n,(Integer.SIZE / Byte.SIZE),compare);
		qsort(q,n,(Integer.SIZE / Byte.SIZE),compare);

		for (int i = 1;i <= n;i++)
		{
			  if (t[tout] > q[touq])
			  {
			  count = count + 1;
			  tout = tout + 1;
			  touq = touq + 1;
			  }
			  else if (t[tout] < q[touq])
			  {
			  weit = weit - 1;
			  touq = touq + 1;
			  count = count - 1;
			  }
			  else if (t[tout] == q[touq])
			  {
				if (t[weit] > q[weiq])
				{
					count += 1;
					weit -= 1;
					weiq -= 1;
				}
				else if (t[weit] < q[weiq] || t[weit] == q[weiq])
				{
					if (t[weit] < q[touq])
					{
						count -= 1;
					weit -= 1;
					touq += 1;
					}
					else if (t[weit] == q[touq])
					{
					weit -= 1;
					touq += 1;
					}
				}

			  }

		}

	System.out.printf("%d\n",count * 200);
	}

	}
}

