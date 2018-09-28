package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int m;
		int j;
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
		int[] pi = sz;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pj = sz + n - 1;
		for (;pi < pj;pi++,pj--)
		{
			m = pi;
			pi[0] = pj;
			*pj = m;
		}
		for (j = 0;j < n - 1;j++)
		{
			System.out.printf("%d ",sz[j]);
		}
		System.out.printf("%d",sz[n - 1]);
		return 0;
	}
}

