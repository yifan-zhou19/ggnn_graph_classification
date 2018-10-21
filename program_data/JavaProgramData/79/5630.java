package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
			 int n;
			 int m;
		for (a = 1;;a++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					n = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
			if (m == 0 || n == 0)
			{
				break;
			}
				 int[] f = new int[99999];
			int i;
			int j;
			int k;
			int t;
			i = 1;
			j = n;
			t = n + 1;
			for (k = 1;k <= n;k++)
			{
				f[k] = k;
			}
				 while (j != 1)
				 {
					   for (i = i;i < t;i++)
					   {
						if (i % m == 0)
						{
						   f[i] = 0;
						   j = j - 1;
						   if (j == 1)
						   {
							  break;
						   }
						}
						if (f[i] != 0)
						{
							f[t] = f[i];
							t++;
						}
					   }
				 }
					  System.out.printf("%d\n",f[t - 1]);
		}
		return 0;
	}

}

