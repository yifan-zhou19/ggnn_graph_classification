package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int N;
		int i;
		int k;
		int t;
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
			   a[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < N;i++)
		{
			  if (a[i] % 2 != 0)
			  {
				 b[i] = a[i];
			  }
			  else
			  {
				 b[i] = 0;
			  }
		}
		for (k = 0;k < N;k++)
		{
			 for (i = 0;i < N - 1;i++)
			 {
				 if (b[i] > b[i + 1])
				 {
					 t = b[i];
					 b[i] = b[i + 1];
					 b[i + 1] = t;
				 }
			 }
		}
		for (i = 0;i < N;i++)
		{
			if (b[i] != 0 && i != N - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			else if (b[i] != 0)
			{
			   System.out.printf("%d",b[N - 1]);
			}
		}
		return 0;
	}


}

