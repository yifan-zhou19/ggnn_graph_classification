package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] jishu = new int[501];
		int[] sz = new int[501];
		j = 0;
		for (int i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				jishu[j] = sz[i];
				j++;
			}
		}
		s = j;
		int e;
		for (int i = 0;i < s;i++)
		{
		  for (int j = 0;j < s - i;j++)
		  {
			 if (jishu[j] > jishu[j + 1])
			 {
				 e = jishu[j];
				 jishu[j] = jishu[j + 1];
				 jishu[j + 1] = e;
			 }
		  }
		}
		for (int j = 0;j < s;j++)
		{
		   if (j != s - 1)
		   {
			System.out.printf("%d,",jishu[j]);
		   }
			else
			{
				System.out.printf("%d",jishu[j]);
			}
		}

	   return 0;
	}

}

