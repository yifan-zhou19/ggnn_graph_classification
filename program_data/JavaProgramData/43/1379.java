package <missing>;

public class GlobalMembers
{
	//int main()

		public static int f(int n)
		{
			int j = 0;
			int m;
			//if(n==2)
			//return 1;
			//else

			  for (int i = 2;i < n;i++)
			  {
					m = n % i;
					if (m == 0)
					{
					j = j + 1;
					}

			  }
			  if (j == 0)
			  {
			  return 1;
			  }
			  else
			  {
			  return 0;
			  }

		}
	public static int Main()
	{
		int n;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int k = 2;k <= n / 2;k++)
		{
		   h = n - k;
		   if ((f(h) == 1) && (f(k) == 1))
		   {
		   System.out.printf("%d %d\n",k,h);
		   }
		}
		System.in.read();
		System.in.read();

	}


}

