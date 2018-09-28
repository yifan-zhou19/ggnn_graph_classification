package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int n;
		int t;
		int p;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			t = c = 0;
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Integer.parseInt(tempVar3);
				}
				if (t < 60)
				{
					c = p;
					t = c + j * 3;
				}
			}
			if (t > 63)
			{
				c = c - (t - 63);
			}
			else if (t < 60)
			{
				c = c + 60 - t;
			}
			System.out.printf("%d\n",c);
		}


		return 0;
	}

}

