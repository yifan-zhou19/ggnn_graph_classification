package <missing>;

public class GlobalMembers
{
	public static int add(int a1, int b1)
	{
		int s;
		s = a1 + b1;
		return s;
	}
	public static int Main()
	{
		int q;
		int p;
		int n;
		int result;
		int i;
		int a;
		int k;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			p = 1;
			q = 1;
			for (i = 2;i < a;i++)
			{
			  result = add(p, q);
			  p = q;
			  q = result;
			}
			if (a == 2 || a == 1)
			{
			  sz[k] = 1;
			}
			else
			{
				sz[k] = result;
			}
		}
		for (k = 0;k < n;k++)
		{
		  System.out.printf("%d\n",sz[k]);
		}
		return 0;
	}

}

