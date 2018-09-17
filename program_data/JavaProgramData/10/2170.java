package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] h = new int[(N + 1)];
		for (int i = 1;i <= N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] f = new int[(N + 1)];
		f[1] = 1;
		for (int i = 2;i <= N;i++)
		{
		   int tem = 0;
		   for (int j = 1;j < i;j++)
		   {
			   if (h[j] >= h[i])
			   {
				  if (f[j] > tem)
				  {
					 tem = f[j];
				  }
			   }
		   }
		   f[i] = tem + 1;
		}
		int max = -1;
		for (int i = 1;i <= N;i++)
		{
		   if (f[i] > max)
		   {
			  max = f[i];
		   }
		}
		System.out.printf("%d",max);
	}

}

