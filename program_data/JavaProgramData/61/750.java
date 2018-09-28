package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 1;
		int m;
		int n;
		int x;
		int y;
		int z;
		int result = 0;
		int[] sz = new int[LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			for (int j = 1;j <= sz[i];j++)
			{
				b = a + c;
			c = a;
			a = b;
			result = b;
			}
			System.out.printf("%d\n",result);
			a = 0;
			b = 0;
			c = 1;
		}
		return 0;
	}





}

