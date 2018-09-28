package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] nj = new int[N];
		int[] lr = new int[N];
		int[] xr = new int[N];
		char[][] zfc = new char[N][20];
		int i;
		int m = 0;
		int k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				nj[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (nj[i] >= 60)
			{
				lr[m] = i;
				m++;
			}
			else
			{
				xr[k] = i;
				k++;
			}
		}
		int j;
		if (m >= 2)
		{
		   for (i = 0;i < m - 1;i++)
		   {
			  for (j = m - 1;j > i;j--)
			  {
				  int e;
				  if (nj[lr[j]] > nj[lr[j - 1]])
				  {

					e = lr[j];
					lr[j] = lr[j - 1];
					lr[j - 1] = e;
				  }
				  else if (nj[lr[j]] == nj[lr[j - 1]] && (lr[j] < lr[j - 1]))
				  {

					e = lr[j];
					lr[j] = lr[j - 1];
					lr[j - 1] = e;
				  }
			  }
		   }
		}
		if (m >= 1)
		{
			for (i = 0;i < m;i++)
			{
				 System.out.printf("%s\n",zfc[lr[i]]);
			}
		}
		if (k > 0)
		{
			for (i = 0;i < k;i++)
			{
				System.out.printf("%s\n",zfc[xr[i]]);
			}
		}
		return 0;
	}




}

