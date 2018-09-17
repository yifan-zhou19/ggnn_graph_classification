package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[MAXN];
	public static int[] f = new int[MAXN];
	public static int n;
	public static int longest_index = -1;
	public static int longest_f = -1;



	public static void Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;++i)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		}

		{
			int i;
			int j;
			for (i = 0; i < n;++i)
			{
			  f[i] = 1;
			}
			for (i = n - 2; i >= 0; --i)
			{
			  for (j = i + 1;j < n;++j)
			  {
				if ((f[i] < f[j] + 1) && (a[i] >= a[j]))
				{
					f[i] = f[j] + 1;
					if (longest_f < f[i])
					{
					  longest_f = f[i];
					  longest_index = i;
					}
				}
			  }
			}
	}

		System.out.printf("%d\n",longest_f);


	}


}

