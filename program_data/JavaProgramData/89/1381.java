package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int[] k = new int[100000];
		int N;
		int i;
		int j = 0;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 100000;i++)
		{
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 a[i] = Integer.parseInt(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 b[i] = Integer.parseInt(tempVar3);
							 }
							 if (a[i] == 0 && b[i] == 0)
							 {
								  x = i - 1;
								  break;
							 }
							 else
							 {
							 ;
							 }
		}
		for (i = 0;i <= x;i++)
		{
			for (n = 0;n < N;n++)
			{
							 if (b[i] == n)
							 {
								k[n]++;
							 }


			}
		}
		for (n = 0;n < N;n++)
		{
			if (k[n] == N - 1)
			{
			System.out.printf("%d",n);
			}
			else
			{
			;
			}
		}



	  return 0;
	}

}

