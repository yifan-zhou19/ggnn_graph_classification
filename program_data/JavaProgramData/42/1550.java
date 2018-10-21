package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100000];
		int k;
		int i;
		int t = 0;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
			for (i = 0;i < n;i++)
			{
			if (sz[i] != k)
			{

			s++;
			}
			}
		for (i = 0;i < n;i++)
		{
			if (sz[i] != k && t != s - 1)
			{
				System.out.printf("%d ",sz[i]);
				t++;
			}
			else if (sz[i] != k && t == s - 1)
			{
				System.out.printf("%d",sz[i]);
			}
		}
		return 0;
	}



}

