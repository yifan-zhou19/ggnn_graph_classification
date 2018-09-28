package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int m;
	int n;
	int k;
	int t;
	int N;
	int[] a = new int[300];
	while (true)
	{
		k = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   N = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (i = 0;i < N;i++)
	   {
			a[i] = i + 1;
	   }


		if (N == 0 && n == 0)
		{
			break;
		}

		for (j = 0,m = 1;;j++,m++)
		{
		   if (j == N)
		   {
			j = 0;
		   }
		   while (a[j] == 0)
		   {
			j++;
			if (j == N)
			{
			j = 0;
			}
		   }
		   if (m == n)
		   {
			a[j] = 0;
			m = 0;
			k++;
		   }
		   if (k == N - 1)
		   {
			break;
		   }
		}

		for (t = 0;t < N;t++)
		{
		   if (a[t] != 0)
		   {
		   System.out.printf("%d\n",a[t]);
		   }
		}

	}
		return 0;
	}
}

