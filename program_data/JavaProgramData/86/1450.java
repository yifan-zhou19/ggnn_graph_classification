package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int r;
		int p;
		int[] v = new int[60];
		int[] f = new int[60];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n - 1;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   for (int j = 0;j <= m - 1;j++)
		   {
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					v[j] = Integer.parseInt(tempVar3);
				}
		}
		   }
		   if (m == 0)
		   {
			   p = 60 - 3 * (m);

			System.out.printf("%d\n",p);
		   }
		   else
		   {
			   int l = 0;
			for (int k = 0;k <= m - 1;k++)
			{
			  if (v[k] + 3 * k >= 58)
			  {
				  l++;
			  }
			}
			if (l == 0)
			{
				System.out.printf("%d\n",60 - 3 * m);
			}
		   }



			int w = 0;
			  for (int k = 0;k <= m - 1;k++)
			  {
			  if ((v[k] + 3 * k >= 58) && (v[k] + 3 * k <= 60))
			  {
				  w = 60 - v[k] - 3 * k;
				  System.out.printf("%d\n",60 - 3 * k - w);
				  break;
			  }
			  else if (v[k] + 3 * k > 60)
			  {
				  System.out.printf("%d\n",60 - 3 * k);
				  break;
			  }
			  }



		}

		  return 0;
	}

}

