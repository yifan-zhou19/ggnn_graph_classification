package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int t = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a > 89 && a < 141 && b>59 && b < 91)
			{
				sz[i] = 0;
			}
			else
			{
				sz[i] = 1;
			}
		}
		//for(i=0;i<n;i++)
		//{ printf("%d\n",sz[i]);}

		for (i = 0;i < n;i++)
		{
			if (sz[i] == 0)
			{
				t = t + 1;
			}
		  //  printf("%d%d",sz[i],t);
			if (sz[i] == 1)
			{
				t = 0;
			}
			if (m < t)
			{
				m = t;
			}
		}
		System.out.printf("%d\n",m);
		return 0;
	}





}

