package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0;i < N;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
		}
		for (int i = 0;i < N;i++)
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
		for (int j = 1;j < N;j++)
		{
		for (int i = 0;i < N - j;i++)
		{
		  if (b[i] > b[i + 1])
		  {
		   s = b[i + 1];
		   b[i + 1] = b[i];
		   b[i] = s;
		  }
		}
		}
		 for (int i = 0;i < N - 1;i++)
		 {
		  if (b[i] != 0)
		  {
		  System.out.printf("%d,",b[i]);
		  }
		 }
		 System.out.printf("%d",b[N - 1]);
		 return 0;
	}

}

