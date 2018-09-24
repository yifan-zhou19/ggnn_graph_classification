package <missing>;

public class GlobalMembers
{
		public static int factor(int n,int min)
		{
		int result = 1;
		int i;
		if (n < min)
		{
				  return 0;
		}
		for (i = min;i < n;i++)
		{
						   if (n % i == 0)
						   {
									  result = result + factor(n / i, i);
						   }
		}
						   return result;
		}
		public static int Main()
		{
			int n;
			int[] a = new int[100000];
			int[] b = new int[100000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (int j = 0;j <= n - 1;j++)
			{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[j] = Integer.parseInt(tempVar2);
					}
					b[j] = factor(a[j], 2);
					System.out.printf("%d\n",b[j]);
			}
					return 0;
		}

}

