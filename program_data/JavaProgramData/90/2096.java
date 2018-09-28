package <missing>;

public class GlobalMembers
{
	public static int sort(int m,int n)
	{
		int sum;
		if (n == 1 && m > 0)
		{
				 return sum = 1;
		}
		else if (n > 1 && m == n)
		{
			 return sum = 1 + sort(n, n - 1);
		}
		 else if (m <= 0)
		 {
			  return sum = 0;
		 }
		 else
		 {
			 return sum = sort(m, n - 1) + sort(m - n, n);
		 }


	}


		public static int Main()
		{
			int N;
			int m;
			int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}
				System.out.printf("%d\n",sort(m, n));
		}

		}

}

